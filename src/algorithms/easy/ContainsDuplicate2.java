package algorithms.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k. 
 * */
public class ContainsDuplicate2 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 2, 5 };
		System.out.println(containsNearbyDuplicate(arr, 3));
	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> mapper = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (mapper.containsKey(nums[i]) && (i - mapper.get(nums[i]) <= k)) {
				return true;
			}
			mapper.put(nums[i], i);
		}
		return false;
	}
}
