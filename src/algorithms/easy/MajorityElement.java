package algorithms.easy;

import java.util.HashMap;
import java.util.Map;

/*169. Majority Element
 * Given an array of size n, find the majority element. The majority element is the element that appears more than floor (n/2)  times.

You may assume that the array is non-empty and the majority element always exist in the array. */
/**
 * @author Sandeep
 *
 */
public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(majorityElement(new int[]{3,2,3}));
	}
	public static int majorityElement(int[] nums) {
        Map<Integer,Integer> mapper = new HashMap<>();
        for(int n : nums){
            Integer val = mapper.get(n);
            if(val==null){
                val = Integer.valueOf(1);
            }else{
                val = val+1;
            }
            mapper.put(n,val);
        }
        //mapper.forEach((k,v) -> System.out.println(k+":"+v));
        int threshold = (int)Math.floor(nums.length/2);
        //System.out.println("threshold: "+threshold);
        int targetElement =0;
        for(Map.Entry<Integer, Integer> entry: mapper.entrySet()){
            if(entry.getValue()>threshold){
                if(entry.getValue()>targetElement){
                    targetElement = entry.getKey();
                }
            }
        }
        return targetElement;
        
    }

}
