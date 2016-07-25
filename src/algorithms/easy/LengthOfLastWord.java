package algorithms.easy;

public class LengthOfLastWord {

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord(" "));
	}

	public static int lengthOfLastWord(String s) {
		String[] temp = s.trim().split(" ");
		return temp[temp.length-1].length();
	}

}
