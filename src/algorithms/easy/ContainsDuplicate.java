package algorithms.easy;

import java.util.HashSet;
import java.util.Set;
/*
 * Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct. 
 * */
/**
 * @author Sandeep
 *
 */
public class ContainsDuplicate {
	public static void main(String args[]) {
		System.out.println(checkDuplicate(new int[] { 1, 3, 4, 4 }));
	}

	public static boolean checkDuplicate(int[] nums) {
		if (nums.length < 1) {
			return false;
		}
		Set<Integer> temp = new HashSet<>();
		boolean check = false;
		for (int x : nums) {
			if (temp.contains(x)) {
				check = true;
				break;
			} else {
				temp.add(x);
			}
		}
		return check;
	}
}