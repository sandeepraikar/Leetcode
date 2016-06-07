package algorithm.medium;

import java.util.PriorityQueue;

/*
 * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

For example,
Given [3,2,1,5,6,4] and k = 2, return 5. 
 * */
/**
 * @author Sandeep
 *
 */
public class FindKthLargestElement {

	public static void main(String[] args) {
		int[] arr ={3,2,1,5,6,4};
		System.out.println(findKthLargest(arr, 2));

	}
	public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq =new PriorityQueue<>(k+1);
        for(int x: nums){
        	pq.add(x);
        	if(pq.size()>k){
        		pq.poll();
        	}
        }
        return pq.poll();
    }

}
