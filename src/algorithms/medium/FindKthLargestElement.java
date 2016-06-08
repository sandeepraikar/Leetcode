package algorithms.medium;

import java.util.Collections;
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
		//System.out.println(findKthLargest(arr, 2));
		PriorityQueue<Integer> queue = new PriorityQueue<>(3);
		for(int i :arr){
			queue.add(i);
			if(queue.size()>2){
				queue.poll();
			}
		}
		queue.forEach(i-> System.out.print(i+" "));
	}
	public static int findKthLargest(int[] nums, int k) {
		
        PriorityQueue<Integer> pq =new PriorityQueue<>(k+1);
        for(int x: nums){
        	pq.add(x);
        	System.out.println("before:");
        	pq.forEach(i-> System.out.print(i+" "));
        	if(pq.size()>k){
        		
        		pq.poll();
        		System.out.println("after");
        		pq.forEach(i-> System.out.print(i+" "));
        	}
        	System.out.println();
        }
        return pq.poll();
    }

}
