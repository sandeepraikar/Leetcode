package algorithms.easy;

/**
 * @author Sandeep
 *
 *
 *         Given a string, determine if it is a palindrome, considering only
 *         alphanumeric characters and ignoring cases.
 * 
 *         For example, "A man, a plan, a canal: Panama" is a palindrome.
 *         "race a car" is not a palindrome.
 */
public class ValidPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome(" race @#%#$^a car "));
		System.out.println(isPalindrome("0P"));

	}

	public static boolean isPalindrome(String s) {
		String filtered = s.trim().replaceAll("[^a-zA-Z0-9]", "")
				.replace(" ", "").toLowerCase();
		System.out.println(filtered);
		for (int i = 0; i < filtered.length(); i++) {
			if (filtered.charAt(i) != filtered
					.charAt(filtered.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
