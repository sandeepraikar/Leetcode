package algorithms.medium;

import java.util.Arrays;

/**
 * @author Sandeep
 *
 *
 *         Given an array of n integers where n > 1, nums, return an array
 *         output such that output[i] is equal to the product of all the
 *         elements of nums except nums[i].
 * 
 *         Solve it without division and in O(n).
 * 
 *         For example, given [1,2,3,4], return [24,12,8,6].
 * 
 *         Follow up: Could you solve it with constant space complexity? (Note:
 *         The output array does not count as extra space for the purpose of
 *         space complexity analysis.)
 */
public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
		int[] result = productExceptSelf(arr);
		System.out.println(Arrays.toString(result));
	}

	public static int[] productExceptSelf(int[] nums) {

	    int len = nums.length;
	    int [] output = new int[len];

	    int leftMult = 1, rightMult = 1;

	    for(int i = len-1; i >= 0; i--){
	        output[i] = rightMult;
	        rightMult *= nums[i];
	        //System.out.println("rightmult : "+rightMult);
	    }
	    //System.out.println(Arrays.toString(output));
	    for(int j = 0; j < len; j++){
	        output[j] *= leftMult;
	        leftMult *= nums[j];
	        //System.out.println("leftmult : "+leftMult);
	    }

	    return output; 
	}
}
