package algorithms.medium;

/*
 *  Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6. 
 * */
public class MaximumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		int[] arr = {-1};
		System.out.println(maxSubArray(arr));
	}

	public static int maxSubArray(int[] arr) {
		int max = Integer.MIN_VALUE,sum=0;
		for(int i=0;i<arr.length;i++){
			if(sum<0){
				sum = arr[i];
			}else{
				sum+=arr[i];
			}
			if(sum>max){
				max=sum;
			}
		}
		return max;
	}
	/*public static int maxSubArray(int[] arr) {
		int sum=0;
		int ans=0;
		for(int i=0;i<arr.length;i++){
			if(ans+arr[i]>0){
				sum+=arr[i];
			}else{
				sum=0;
			}
			ans = Math.max(ans, sum);
		}
		return ans;
	}*/
}
