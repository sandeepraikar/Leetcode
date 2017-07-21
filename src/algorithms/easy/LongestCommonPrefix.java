package algorithms.easy;

/**
 * @author Sandeep
 * 
 *         Write a function to find the longest common prefix string amongst an
 *         array of strings.
 *
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] arr = { "abc", "abcdd", "abcdghhh", "pqrggg", "pqtsbbb",
				"pqrsrgggs" };
		String a = "test";
		String b = "test2asdasd";
		// System.out.println(b.contains(a));
		String result = longestCommonPrefix(arr);
		System.out.println(result);
	}

	/*
	 * public static String longestCommonPrefix(String[] strs) { int minLength =
	 * strs.length+1; for (String word : strs) { if(minLength> word.length()){
	 * minLength=word.length(); } } //for(int i=0) }
	 */

	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";

		if (strs.length == 1)
			return strs[0];

		String minString = strs[0];
		for (String str : strs)
			if (str.length() < minString.length())
				minString = str;

		System.out.println(minString);
		// MODIFIED PART
		for (String str : strs) {
			for (int i = minString.length() - 1; i >= 0; i--) {
				if (str.charAt(i) != minString.charAt(i))
					minString = minString.substring(0, i);
			}
		}

		return minString;
	}
	
	private static String longestCommonPrefix2(String[] str2) {
		if(str2==null || str2.length==0){
			return null;
		}
		int minLen = Integer.MAX_VALUE;
		for(String x :  str2){
			minLen = Math.min(minLen, x.length());
		}
		int low = 1;
		int high = minLen;
		System.out.println("high:"+high);
		while(low<=high){
			int mid = (low+high)/2;
			System.out.println(mid);
			if(isCommonPrefix(str2,mid)){
				low = mid+1;
			}else{
				high = mid -1;
			}
		}
		return str2[0].substring(0,(low+high)/2);
	}

	private static boolean isCommonPrefix(String[] str2, int len) {
		String str = str2[0].substring(0,len);
		for(String x : str2){
			if(!x.startsWith(str))
				return false;
		}
		return true;
	}
}
