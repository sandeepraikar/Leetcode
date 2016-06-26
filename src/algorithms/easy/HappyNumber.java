package algorithms.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Sandeep
 *
 *
 *         A happy number is a number defined by the following process: Starting
 *         with any positive integer, replace the number by the sum of the
 *         squares of its digits, and repeat the process until the number equals
 *         1 (where it will stay), or it loops endlessly in a cycle which does
 *         not include 1. Those numbers for which this process ends in 1 are
 *         happy numbers.
 * 
 *         Example: 19 is a happy number
 * 
 *         12 + 92 = 82 82 + 22 = 68 62 + 82 = 100 12 + 02 + 02 = 1
 */
public class HappyNumber {

	public static void main(String[] args) {
		System.out.println(isHappy(19));
	}

	public static boolean isHappy(int n) {
		int result = 0;
		Set<Integer> set = new HashSet<>();
		while (set.add(n)) {
			result = 0;
			while (n > 0) {
				int temp = n % 10;
				result += Math.pow(temp, 2);
				n /= 10;
			}
			if (result == 1) {
				return true;
			} else {
				n = result;
			}
		}
		return false;
	}
}
