package algorithms.medium;

import java.util.ArrayList;
import java.util.List;

public class StringPermutationv2 {

	public static void main(String args[]){
		String test = "abc";
		List<String> result = permutations(test);
		System.out.println(result.toString());
		result.forEach(System.out::println);
	}

	public static List<String> permutations(String test) {
		List<String> result = new ArrayList<>();
		permute("",test,result);
		return result;
				
	}
	
	private static void permute(String prefix, String suffix, List<String> result){
		// terminating condition for recursion
		if(suffix.length()==0){
			result.add(prefix);
			return;
		}else{
			for(int i=0;i<suffix.length();i++){
				permute(prefix+suffix.charAt(i), suffix.substring(0,i)+ suffix.substring(i+1,suffix.length()), result);
			}
		}
	}
}
