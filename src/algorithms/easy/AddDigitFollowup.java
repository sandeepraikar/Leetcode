package algorithms.easy;

public class AddDigitFollowup {

	public static void main(String[] args) {
		System.out.println(addDigits(34));
	}

	public static int addDigits(int num) {
		if(num<9){
			return num;
		}else{
			return (num-1)%9+1;
		}
		
	}

}
