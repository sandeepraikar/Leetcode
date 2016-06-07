package algorithms.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TopKFrequentElements {

	public static void main(String args[]){
		int[] arr= {1,1,1,2,2,3};
		List<Integer> result = topKFrequent(arr, 2);
		result.forEach(i-> System.out.println(i));
	}
	public static List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
		Map<Integer,Integer> mapper = new HashMap<>();
		for(int x: nums){
			Integer val = mapper.get(x);
			if(val==null){
				val = Integer.valueOf(1);
			}else{
				val = val +1;
			}
			mapper.put(x, val);
		}
		
		Comparator<Map.Entry<Integer, Integer>> compr = new Comparator<Map.Entry<Integer,Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1,
					Entry<Integer, Integer> o2) {
				Integer val1 = o1.getValue();
				Integer val2 = o2.getValue();
				return val2.compareTo(val1);
			}
		};
		Set<Entry<Integer, Integer>> setEntry = mapper.entrySet();
		List<Entry<Integer, Integer>> listOfEntryObj = new ArrayList<>(setEntry);
		Collections.sort(listOfEntryObj, compr);
		
		for(int i=0;i<k; i++){
			result.add(listOfEntryObj.get(i).getKey());
		}
		
		/*LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
		for (Entry<Integer, Integer> entry : listOfEntryObj) {
			sortedMap.put(entry.getKey(),entry.getValue());
		}
		 */		
		
		return result;
    }
}
