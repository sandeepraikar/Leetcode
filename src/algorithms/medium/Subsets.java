package algorithms.medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		int[] arr ={1,2,3};
		List<List<Integer>> result = subsets(arr);
		for (List<Integer> list : result) {
			list.forEach(i->System.out.print(i+" "));
			System.out.println();
		}
	}

	public static List<List<Integer>> subsets(int[] nums){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result.add(new ArrayList<Integer>());
		
		for(int i=0;i<nums.length;i++){
			int len = result.size();
			for(int j=0;j<len;j++){
				List<Integer> temp = new ArrayList<>(result.get(j));
				
				temp.add(nums[i]);
				result.add(temp);
			}
		}
		return result;
	}
}
