package algorithms.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Sandeep
 * 
 * 349. Intersection of Two Arrays
 * Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2]. 

 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
      Set<Integer> set1 = new HashSet<Integer>();
      for(int x: nums1){
          set1.add(x);
      }
      Set<Integer> set2 = new HashSet<Integer>();
      for(int x: nums2){
          set2.add(x);
      }
      set1.retainAll(set2);
      int[] result = new int[set1.size()];
      int i=0;
      for(Integer x:set1){
          result[i]=x;
          i++;
      }
      return result;
    }
}