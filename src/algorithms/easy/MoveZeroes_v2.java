package algorithms.easy;


/**
 * @author Sandeep
 *
 *
 *283. Move Zeroes
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:

    You must do this in-place without making a copy of the array.
    Minimize the total number of operations.

 */
public class MoveZeroes_v2 {
	public static void main(String args[]){
		int[] inpArray ={0,1,0,3,12};
		int counter=0;
		for(int i=0;i<inpArray.length;i++){
			if(inpArray[i]==0){
				counter++;
			}else{
				inpArray[i-counter]=inpArray[i];
			}
		}
		
		while(counter>0){
			inpArray[inpArray.length-counter]=0;
			counter--;
		}
		for (int i : inpArray) {
			System.out.println(i+" ");
		}
	}
}
