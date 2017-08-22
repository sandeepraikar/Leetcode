package algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutationsv2 {

	public static void main(String[] args) {
		int[] input= {1,2,3};
		List<int[]> result = new ArrayList<int[]>();
		permutations(input,0,result);
		for(int[] t: result){
			System.out.println(Arrays.toString(t));
		}
	}

	private static void permutations(int[] input, int start, List<int[]> result) {
		if(start==input.length){
			result.add(input.clone());
			return;
		}else{
			for(int i=start;i<input.length;i++){
				swap(input,start,i);
				permutations(input,start+1,result);
				swap(input,start,i);
			}
		}
	}
	
	private static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
