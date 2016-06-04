package algorithms.easy;

import java.util.Scanner;

/**
 * @author Sandeep
 *
 */
public class ReverseString {
	public static String reverseString(String s) {
        StringBuffer sb=new StringBuffer();
        for(int i=s.length()-1;i>=0;i--){
        	sb.append(s.charAt(i));
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(reverseString(in.next()));
		in.close();
	}

}
