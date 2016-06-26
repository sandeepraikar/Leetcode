package algorithms.easy;

/**
 * @author Sandeep
 *
 *
 *         Write a program to check whether a given number is an ugly number.
 * 
 *         Ugly numbers are positive numbers whose prime factors only include 2,
 *         3, 5. For example, 6, 8 are ugly while 14 is not ugly since it
 *         includes another prime factor 7.
 * 
 *         Note that 1 is typically treated as an ugly number.
 */
public class UglyNumber {

	public static void main(String[] args) {
		System.out.println(isUgly(14));
	}

	public static boolean isUgly(int n) {
		if (n <= 0) {
			return false;
		}
		if (n == 1) {
			return true;
		}
		while (n != 1) {
			if (n % 2 == 0) {
				n /= 2;
			} else if (n % 3 == 0) {
				n /= 3;
			} else if (n % 5 == 0) {
				n /= 5;
			} else {
				return false;
			}
		}
		return true;
	}

	/*
	 * public static boolean isUgly(int num) { Set<Integer> primeFactors =
	 * computePrimeFactors(num); // primeFactors.forEach(i->
	 * System.out.println(i)); Set<Integer> uglyFactors = new
	 * HashSet<>(Arrays.asList(2, 3, 5)); primeFactors.removeAll(uglyFactors);
	 * // System.out.println(primeFactors.size()); return primeFactors.size() ==
	 * 0 ? true : false; }
	 * 
	 * private static Set<Integer> computePrimeFactors(int num) { Set<Integer>
	 * factors = new HashSet<>(); for (int i = 2; i <= num / i; i++) { while
	 * (num % i == 0) { factors.add(i); num = num / i; } } if (num > 1) {
	 * factors.add(num); } return factors; }
	 */

}
