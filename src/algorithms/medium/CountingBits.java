package algorithms.medium;


/*Given a non negative integer number num. For every numbers i in the range 0 <= i<= num calculate the number of 1's in their binary representation and return them as an array.

 Example:
 For num = 5 you should return [0,1,1,2,1,2].

 Follow up:

 It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
 Space complexity should be O(n).
 Can you do it like a boss? Do it without using any builtin function like __builtin_popcount in c++ or in any other language.
 */
/**
 * @author Sandeep
 *
 */
public class CountingBits {

	public static void main(String[] args) {
		//method 1 using inbuilt api
		//int[] result = countBits(2);
		
		//method 2 using binaryEquivalent conversion
		//int[] result = countBits2(5);
		
		//method 3 using bit operator
		int[] result = countBits3(5);
		
		for (int i : result) {
			System.out.print(i+" ");
		}
	}

	private static int[] countBits3(int num) {
		int arr[] = new int[num+1];
        arr[0] = 0;
        for (int i = 1; i <= num; ++i) {
            arr[i] = arr[i & i-1] + 1;
        }
        return arr;
	}

	public static int[] countBits(int num) {
		int[] result = new int[num+1];
		for(int i=0;i<=num;i++){
			result[i]=Integer.bitCount(i);
		}
		return result;	
	}
	
	public static int[] countBits2(int num){
		int[] result = new int[num+1];
		for(int i =0;i<=num;i++){
			result[i]=getBitCount(i);
		}
		return result;
	}

	private static int getBitCount(int n) {
		StringBuffer sb = new StringBuffer();
		while(n>0){
			int temp = n%2;
			sb.append(temp);
			n=n/2;
		}
		String binaryEquivalent = sb.reverse().toString();
		int count=0;
		for (char x: binaryEquivalent.toCharArray()) {
			if(x=='1'){
				count++;
			}
		}
		return count;
	}
}
