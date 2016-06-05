package algorithms.easy;

import java.util.Arrays;

/*
 * 242. Valid Anagram
Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false. 
		*/
/**
 * @author Sandeep
 *
 */
public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		} else {
			char[] sArray = s.toCharArray();
			char[] tArray = t.toCharArray();
			Arrays.sort(sArray);
			Arrays.sort(tArray);

			return new String(sArray).equals(new String(tArray)) ? true : false;
		}

	}
}
