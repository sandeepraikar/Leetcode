package algorithms.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

 * */
/**
 * @author Sandeep
 *
 */
public class TwoSum {

	public static void main(String[] args) {
		int arr[] ={2,7,11,15};
		int[] result = twoSum(arr, 9);
		
		System.out.println(Arrays.toString(result));
	}
	public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mapper = new HashMap<>();
        int[] result = new int[2];
        
        for(int j=0;j<nums.length;j++){
        	if(mapper.containsKey(target-nums[j])){
        		result[0]=j;
        		result[1]=mapper.get(target-nums[j]);
        		break;
        	}
        	mapper.put(nums[j],j);
        }
        
        return result;
    }

}
