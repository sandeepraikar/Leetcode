package algorithms.easy;

import java.util.HashMap;
import java.util.Map;

/*
 * Roman to Integer
 * Given a roman numeral, convert it to an integer.

 Input is guaranteed to be within the range from 1 to 3999.

 I 	1
 IV 	4
 V 	5
 IX 	9
 X 	10
 XL 	40
 L 	50
 XC 	90
 C 	100
 CD 	400
 D 	500
 CM 	900
 M 	1000

 */
/**
 * @author Sandeep
 *
 */
public class RomanToInteger {

	public static void main(String args[]) {
		System.out.println(romanToInt("MCMXCVI"));
	}

	public static int romanToInt(String s) {
		Map<Character, Integer> romanMap = new HashMap<>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);

		int result = 0;
		//Forward
		for (int i = 0; i <= s.length()-1; i++) {
			if(i==s.length()-1){
				result += romanMap.get(s.charAt(i));
				break;
			}
			if (romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i + 1))) {
				result += romanMap.get(s.charAt(i));
			} else {
				result -= romanMap.get(s.charAt(i));
			}
		}
		//MCMXCVI
		
		//reverse
		result = romanMap.get(s.charAt(s.length() - 1));
	    for (int i = s.length() - 2; i >= 0; i--) {
	        if (romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i + 1)))
	            result += romanMap.get(s.charAt(i));
	        else
	            result -= romanMap.get(s.charAt(i));
	    }
		return result;
	}
}
