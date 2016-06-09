package algorithms.medium;

/*
 * Given an array of integers, every element appears twice except for one. Find that single one.

 Note:
 Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory? 
 * */
/**
 * @author Sandeep
 *
 */
public class SingleNumber {

	public static void main(String[] args) {
		int arr[] ={1,1,3,4,5,6,6,5,4};
		System.out.println(singleNumber(arr));
	}

	public static int singleNumber(int[] nums) {
		int answer = 0;
		for(int n : nums){
			answer ^=n;
		}
		return answer;
	}
}
