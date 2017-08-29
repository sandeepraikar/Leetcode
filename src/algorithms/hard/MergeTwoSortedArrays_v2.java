package algorithms.hard;

public class MergeTwoSortedArrays_v2 {

	public static void main(String[] args) {
		//int[] arr1 = {1,2,5,11,15};
		//int[] arr2 = {3,4,13,17,18};
		
		int[] arr1 = {1,2};
		int[] arr2 = {3,4};
		System.out.println(findMedianOfSortedArrays(arr1,arr2));
	}

	private static double findMedianOfSortedArrays(int[] arr1, int[] arr2) {
		
		return findMedianOfSortedArrays(arr1, arr2,0,arr1.length-1, 0,arr2.length-1);
	}

	private static double findMedianOfSortedArrays(int[] arr1, int[] arr2,
			int startIndexOfA, int endIndexOfA, int startIndexOfB, int endIndexOfB) {
		
		if((endIndexOfA-startIndexOfA==1) && (endIndexOfB-startIndexOfB==1)){
			return (1.0*( (Math.max(arr1[startIndexOfA], arr2[startIndexOfB])) +  (Math.min(arr1[endIndexOfA], arr2[endIndexOfB]))) )/2;
		}
		
		int m1Index = (startIndexOfA+endIndexOfA)/2;
		int m2Index = (startIndexOfB+endIndexOfB)/2;
		
		int m1 = arr1[m1Index];
		int m2 = arr2[m2Index];
		if(m1==m2){
			return m1;
		}
		if(m1<m2){
			startIndexOfA=m1Index;
			endIndexOfB=m2Index;
		}
		if(m1>m2){
			startIndexOfB=m2Index;
			endIndexOfA=m1Index;
		}
		return findMedianOfSortedArrays(arr1, arr2, startIndexOfA, endIndexOfA, startIndexOfB, endIndexOfB);
	}
	
	
}
