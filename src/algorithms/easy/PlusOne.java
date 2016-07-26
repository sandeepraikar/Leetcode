package algorithms.easy;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int[] result = plusOne(new int[]{9});
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] plusOne(int[] digits){
		 for (int i = digits.length - 1; i >=0; i--) {
		        if (digits[i] != 9) {
		            digits[i]++;
		            break;
		        } else {
		            digits[i] = 0;
		        }
		    }
		    if (digits[0] == 0) {
		        int[] res = new int[digits.length+1];
		        res[0] = 1;
		        return res;
		    }
		    return digits;
	}
	/*public static int[] plusOne(int[] digits) {
		int[] result;
		if(digits[0]<9){
			result = new int[digits.length];
		}else {
			result = new int[digits.length+1];
		}
		
		if(digits.length==0){
			return null;
		}
		int len=result.length-1;
		int carry =0;
		for(int j=digits.length-1;j>=0;j--){
			int sum = carry;
			if(j==digits.length-1){
				sum=digits[j]+1;
				result[len]=sum%10;
				carry=sum/10;
				len--;
				continue;
			}
			sum+=digits[j];
			result[len]=sum%10;
			carry=sum/10;
			len--;
		}
		if(carry!=0){
			result[0]=carry;
		}
		return result;
	}*/
}
