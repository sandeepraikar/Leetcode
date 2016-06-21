package algorithms.easy;

public class ReverseVowelsOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseVowels("hello"));

	}

	public static String reverseVowels(String input) {
		StringBuilder sb = new StringBuilder();
		int j = input.length() - 1;
		for (int i = 0; i < input.length(); i++) {
			if ("AEIOUaeiou".indexOf(input.charAt(i)) != -1) {
				while (j >= 0 && "AEIOUaeiou".indexOf(input.charAt(j)) == -1) {
					j--;
				}
				sb.append(input.charAt(j));
				j--;

			} else {
				sb.append(input.charAt(i));
			}
		}
		return sb.toString();
	}
}
