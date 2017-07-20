package algorithms.easy;

import java.util.HashMap;
import java.util.Map;



public class IsomorphicStrings {

	public static void main(String args[]) {
		System.out.println(isIsomorphic("paper", "title"));
		System.out.println(isIsomorphic("paper", "xdger"));
	}

	private static boolean isIsomorphic(String s1, String s2) {
		Map<Character,Character> mapper = new HashMap<Character,Character>();
		if(s1.length()!=s2.length()){
			return false;
		}
		for(int i=0;i<s1.length();i++){
			char a = s1.charAt(i);
			char b = s2.charAt(i);
			if(mapper.containsKey(a)){
				if(mapper.get(a)!=b){
					return false;
				}
			}else{ 
				if(mapper.containsValue(b)){
					return false;
				}
				mapper.put(a,b);
			}
		}
		return true;
	}
}
