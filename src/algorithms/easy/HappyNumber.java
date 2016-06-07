package algorithms.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isHappy(19));
	}

	public static boolean isHappy(int n) {
		int result = 0;
		Set<Integer> set = new HashSet<>();
		while (set.add(n)) {
			result =0;
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
