package algorithms.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given a sorted array, two integers k and x, find the k closest elements to x in the array. The result should also be sorted in ascending order. If there is a tie, the smaller elements are always preferred.

Example 1:
Input: [1,2,3,4,5], k=4, x=3
Output: [1,2,3,4]
Example 2:
Input: [1,2,3,4,5], k=4, x=-1
Output: [1,2,3,4]
Note:
The value k is positive and will always be smaller than the length of the sorted array.
Length of the given array is positive and will not exceed 104
Absolute value of elements in the array and x will not exceed 104
 * @author Sandeep
 *
 */
public class FindClosestElements {

	 public List<Integer> findClosestElements(List<Integer> arr, int k, int x) {
	       List<Integer> result = new ArrayList<>();
	       int index = Collections.binarySearch(arr,x);
	       index = index < 0 ? -(index + 1) : index;
	        
	       int low = index-1;
	       int high = index;
	        
	       for(int i=0;i<k;i++){
	           if(low>=0 && high< arr.size()){
	               if(Math.abs(arr.get(low)-x) <= Math.abs(arr.get(high)-x)){
	                   result.add(0,arr.get(low--));
	               }else{
	                   result.add(arr.get(high++));
	               }
	           }
	           else if(low>=0){
	               result.add(0,arr.get(low--));
	           }else{
	               result.add(arr.get(high++));
	           }
	               
	       }
	        return result;
	    }
}
