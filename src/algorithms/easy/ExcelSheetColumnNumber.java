package algorithms.easy;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Sandeep
 *
 */

/*171. Excel Sheet Column Number
 * Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
 */
public class ExcelSheetColumnNumber {

	public static void main(String args[]) {
		int res =titleToNumber("AB");
		System.out.println(res);
	}

	public static int titleToNumber(String s) {
		Map<Character, Integer> mapper = new TreeMap<>();
		int val = 0;
		for (char character = 'A'; character <= 'Z'; character++) {
			val++;
			mapper.put(character, val);
		}
		int value = 0;
		int j=0;
		if (s.length() > 1) {
			for (int i = s.length() - 1; i >= 0; i--) {
				value += (int) Math.pow(26, j) * mapper.get(s.charAt(i));
				j++;
			}
		} else {
			return mapper.get(s.toCharArray()[0]);
		}
		return value;
	}
}
