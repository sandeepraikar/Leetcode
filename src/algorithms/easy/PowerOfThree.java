package algorithms.easy;

public class PowerOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfThree(27));
	}

	public static boolean isPowerOfThree(int n) {
		return (Math.log10(n)/Math.log10(3))%1==0;
	}

}
