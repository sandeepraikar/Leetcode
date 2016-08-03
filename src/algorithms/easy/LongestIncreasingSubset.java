package algorithms.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestIncreasingSubset {

	public static void main(String[] args) {
		int[] arr = { 5, 6, -1, 7, 8, 9, 10, 2, 1 };
		int[] result = longestIncreasingSubset(arr);
		System.out.println(Arrays.toString(result));
	}

	private static int[] longestIncreasingSubset(int[] arr) {
		List<Integer> result = new ArrayList<>();
		List<Integer> subList = new ArrayList<>();
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1]) {
				subList.add(arr[i]);
			} else {
				if (subList.size() > result.size()) {
					result = new ArrayList<Integer>(subList);
				}
				subList.clear();
			}
		}
		return result.stream().mapToInt(i->i).toArray();
	}

}
