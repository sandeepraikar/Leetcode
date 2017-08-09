package algorithms.easy;

public class RemoveDuplicatesFromSortedArray {
	public static void main(String args[]) {
		int[] nums={1,2,2,3,4,4,5,6};
		System.out.println(removeDuplicates(nums));
	}

	public static int removeDuplicates(int[] nums) {
		/*int j=0;
		for(int i=1;i<nums.length;i++){
			if(nums[i]==nums[j]){
				i++;
			}
			j++;
			nums[j]=nums[i];
			i++;
		}*/
		int i=1;
		int j=0;
		while(i<nums.length){
			if(nums[i]==nums[j]){
				i++;
			}else{
				j++;
				nums[j]=nums[i];
				i++;
			}
		}
		for(int n: nums){
			//System.out.print(n+" ");
		}
		return ++j;
	}

}
