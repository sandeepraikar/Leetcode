package algorithms.medium;

/*
 * Missing Number
 *  Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.

Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity? 
 * */
public class MissingNumber {

	//Using Binary Search
    /*public static int missingNumber(int[] nums) {
    	int low=0, high=nums.length,mid=0;
    	while(low<high){
    		mid=(low+high)/2;
    		if(nums[mid]>mid){
    			high=mid;
    		}else{
    			low=mid+1;
    		}
      	}
    	return low;
    }*/
    
	//Using XOR
	/*public static int missingNumber(int[] nums) {
		int res = nums.length;
	    for(int i=0; i<nums.length; i++){
	        res ^= i;
	        //System.out.println(res);
	        res ^= nums[i];
	        //System.out.println("afer:"+res);
	    }
	    return res;
	}*/
	
	//Using sum
    public static int missingNumber(int[] nums){
    	int sum=0;
    	for(int i=0;i<nums.length;i++){
    		sum+=nums[i]-i;
    	}
    	return nums.length-sum;
    }
	
	public static void main(String args[]){
    	int[] arr={0,1,2,4};
    	
    	System.out.println(missingNumber(arr));
    }
}
