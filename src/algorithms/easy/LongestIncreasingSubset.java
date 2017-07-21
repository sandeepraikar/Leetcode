package algorithms.easy;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubset {

	public static void main(String[] args) {
		int[] arr = { 5, 6, -1, 7, 8, 9, 10, 2, 1 };
		/*int[] result = longestIncreasingSubset(arr);
		System.out.println(Arrays.toString(result));*/
		List<Integer> res = findLIS(arr);
		res.forEach(System.out::println);
	}

	/*private static int[] longestIncreasingSubset(int[] arr) {
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
	}*/
	
	public static List<Integer> findLIS(int[] array) {
	    List<Integer> longest = new ArrayList<>();
	    List<Integer> current = new ArrayList<>();

	    int previous = Integer.MAX_VALUE;
	    for (int value : array) {
	        if (value <= previous) {
	            if (longest.size() < current.size()) {
	                longest = current;
	            }
	            current = new ArrayList<>();
	        }
	        current.add(value);
	        previous = value;
	    }

	    return longest.size() < current.size() ? current : longest;
	}

}
