package algorithms.easy;

/*
 *  Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100". 
 * */
/**
 * @author Sandeep
 *
 */
public class AddBinary {

	public static void main(String args[]) {
		System.out.println(addBinary("11", "1"));
		//System.out.println(convertBinaryToInteger("101"));
		
	}

	private static String addBinary(String a, String b) {
		int i=a.length()-1;
		int j=b.length()-1;
		int carry=0;
		StringBuffer sb = new StringBuffer();
		while(i>=0 || j>=0){
			int sum=carry;
			if(i>=0){
				sum+=a.charAt(i--)-'0';				
			}
			if(j>=0){
				sum+=b.charAt(j--)-'0';				
			}
			sb.append(sum%2);
			carry = sum/2;
		}
		if(carry!=0){
			sb.append(carry);
		}
		return sb.reverse().toString();
	}

	/*public static String addBinary(String a, String b) {

		int val = convertBinaryToInteger(a)+convertBinaryToInteger(b);
		return convertToBinary(val);
	}
	
	public static int convertBinaryToInteger(String num){
		int result = 0;
		for(int i=num.length()-1;i>=0;i--){
			result+=Math.pow(2, (num.length()-1)-i) *  Character.getNumericValue(num.charAt(i));
		}
		return result;
	}
	public static String convertToBinary(int num){
		StringBuffer sb = new StringBuffer();
		if(num<=0){
			return String.valueOf(num);
		}
		while(num>0){
			int temp = num%2;
			sb.append(temp);
			num/=2;
		}
		return sb.reverse().toString();
	}
*/}
