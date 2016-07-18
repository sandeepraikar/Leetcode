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
		String[] arr={"abc","abcdd","abcdghhh","pqrggg","pqtsbbb","pqrsrgggs"};
		String a="test";
		String b="test2asdasd";
		System.out.println(b.contains(a));
		System.out.println(longestCommonPrefix(arr));
	}

	public static String longestCommonPrefix(String[] strs) {
		String commonPrefix=strs[0];
		for(int i=1;i<strs.length;i++){
			if(strs[i].contains(commonPrefix)){
				System.out.println(commonPrefix.length()-1);
				System.out.println(strs[i]);
				commonPrefix=strs[i].substring(0,commonPrefix.length()-1);
				System.out.println("-->"+commonPrefix);
			}
		}
		System.out.println(commonPrefix);
		return null;
	}
}
