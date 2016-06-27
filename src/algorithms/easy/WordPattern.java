package algorithms.easy;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {

	public static void main(String[] args) {
		System.out.println(wordPattern("abba","dog cat cat dog"));
		System.out.println(wordPattern("abba","dog cat cat fish"));
		System.out.println(wordPattern("aaaa","dog cat cat dog"));
	}

	public static boolean wordPattern(String pattern, String str) {
        int patternLenght= pattern.length();
        String[] array = str.split(" ");
        int arrayLength= array.length;
        if(patternLenght!=arrayLength){
        	return false;
        }
        Map<Character,Integer> charMap = new HashMap<>();
        char[] patternArray = pattern.toCharArray();
        Arrays.sort(patternArray);
        for (Character c : patternArray) {
			charMap.put(c, charMap.getOrDefault(c, 0)+1);
		}
       // charMap.forEach((k,v)-> System.out.println(k+" : "+v));
        Map<String,Integer> textMap = new HashMap<>();
        Arrays.sort(array);
        //System.out.println(Arrays.toString(array));
        for (String word : array) {
			textMap.put(word,textMap.getOrDefault(word, 0)+1);
		}
        
        //textMap.forEach((k,v)-> System.out.println(k+" : "+v));
        
        Set<Integer> values1 = new HashSet<>(charMap.values());
        Set<Integer> values2 = new HashSet<>(textMap.values());
        return values1.equals(values2)?true:false;
		
    }
}
