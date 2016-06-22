package algorithms.easy;

/**
 * @author Sandeep
 * 
 *         Palindrome Number Determine whether an integer is a palindrome. Do
 *         this without extra space.
 * 
 *         click to show spoilers. Some hints:
 * 
 *         Could negative integers be palindromes? (ie, -1)
 * 
 *         If you are thinking of converting the integer to string, note the
 *         restriction of using extra space.
 * 
 *         You could also try reversing an integer. However, if you have solved
 *         the problem "Reverse Integer", you know that the reversed integer
 *         might overflow. How would you handle such case?
 * 
 *         There is a more generic way of solving this problem.
 * 
 *
 */
public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrome(52325));
	}

	public static boolean isPalindrome(int x) {
		
		int p = x; 
	    int q = 0; 

	    while (p >= 10){
	        q *=10; 
	        q += p%10; 
	        p /=10; 
	    }

	    return q == x / 10 && p == x % 10;
	   }

}
