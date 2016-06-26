package algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sandeep
 *
 *
 *         Given a collection of distinct numbers, return all possible
 *         permutations.
 * 
 *         For example, [1,2,3] have the following permutations:
 * 
 *         [ [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1] ]
 */
public class Permutations {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		List<List<Integer>> result = permute(arr);
		/*for (List<Integer> list : result) {
			for (Integer integer : list) {
				System.out.print(integer+", ");
			}
			System.out.println();
		}*/
	}

/*	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(nums.length==0 || nums==null){
			return result;
		}
		List<Integer> list = new ArrayList<>();
		list.add(nums[0]);
		result.add(list);
		for(int i=1;i<nums.length;i++){
			int size = result.size();
			System.out.println("current size: "+size);
			for(int j=0;j<size;j++){
				int size2= result.get(0).size();
				for(int k=0;k<size2;k++){
					List<Integer> l = new ArrayList<>(result.get(0));
					l.add(k, nums[i]);
					result.add(l);
				}
				result.remove(0);
			}
			
		}
		return result;
		
	}*/
	
	 public static List<List<Integer>> permute(int[] nums) {
		 	System.out.println("starting");
	        int len = nums.length;
	        List<List<Integer>> perms = new ArrayList<>();;
	        if (len==1){
	            ArrayList<Integer> last = new ArrayList<Integer>();
	            last.add(nums[0]);
	            perms.add(last);
	            return perms;
	        }
	        int digit = nums[0];
	        List<List<Integer>> remaining = permute(Arrays.copyOfRange(nums,1,len));
	        for (List<Integer> list : remaining) {
				for (Integer integer : list) {
					System.out.print(""+integer+",");
				}
				System.out.println();
			}
	        for(List<Integer> ls : remaining){
	            for(int i=0;i<len;i++){
	                ls.add(i,digit);
	                perms.add(new ArrayList<Integer>(ls));
	                ls.remove(i);
	            }
	        }
	        return perms;
	    }

}
