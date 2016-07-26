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
}
