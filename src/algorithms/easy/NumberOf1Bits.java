package algorithms.easy;

/*
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).

For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.*/
/**
 * @author Sandeep
 *
 */
public class NumberOf1Bits {

	public static void main(String[] args) {
		System.out.println(hammingWeight(11));
	}

	// you need to treat n as an unsigned value
	public static int hammingWeight(int n) {
		int count = 0;
		/*
		 * while(n!=0){ if((n & 1) ==1){ count++; } n=n>>>1; } return count;
		 */
		String test = Integer.toBinaryString(n);

		for (char x : test.toCharArray()) {
			if (x == '1') {
				count++;
			}
		}
		return count;
	}

	//Naive approach
/*	public static int hammingWeight(int n) {
		int count = 0;
		String test = Integer.toBinaryString(n);

		for (char x : test.toCharArray()) {
			if (x == '1') {
				count++;
			}
		}
		return count;
	}*/

}
