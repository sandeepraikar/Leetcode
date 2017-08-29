package algorithms.hard;

import java.util.Collections;
import java.util.PriorityQueue;

public class MergeTwoSortedArrays_v1 {

	public static void main(String[] args) {
		//int[] arr1 = {1,2,5,11,15};
		//int[] arr2 = {3,4,13,17,18};
		int[] arr1 = {1,2};
		int[] arr2 = {3,4};
		System.out.println(findMedianSortedArrays(arr1,arr2));

	}
	   static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	    static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	    
	    public static void addNum(int n){
	        maxHeap.add(n);
	        minHeap.add(maxHeap.poll());
	        if(maxHeap.size()<minHeap.size()){
	            maxHeap.add(minHeap.poll());
	        }
	    }
	    
	    public static double getMedian(){
	        if(maxHeap.size()==minHeap.size()){
	            return (minHeap.peek()+ maxHeap.peek())/2.0;
	        }else{
	            return (double)maxHeap.peek();
	        }
	    }
	        
	    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        for(int x :nums1){
	            addNum(x);
	        }
	        for(int x :nums2){
	            addNum(x);
	        }
	        return getMedian();
	    }
}
