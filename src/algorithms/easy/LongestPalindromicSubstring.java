package algorithms.easy;

public class LongestPalindromicSubstring {

	public static void main(String args[]){
		String test = "bananas";
		System.out.println(getLongestPalindromicSubstring(test));
	}

	private static String getLongestPalindromicSubstring(String test) {
		if(test==null || test.isEmpty()){
			return null;
		}
		boolean[][] table = new boolean[test.length()][test.length()];
		int maxLen= 0;
		int palindromeStartsAt =0;
		int n= test.length();
		// fill up the table for all the diagonal case
		for(int i=0;i<n;i++){
			table[i][i]=true;
		}
		
		// fill up the table for palindrome length of 2
		for(int i=0;i<n-1;i++){
			if(test.charAt(i)==test.charAt(i+1)){
				table[i][i+1]=true;
				palindromeStartsAt=i;
				maxLen=2;
			}
		}
		
		// fill up table for palindrome length >2
		for(int curr_len=3;curr_len<=n;curr_len++){
			for(int i=0;i<n-curr_len+1;i++){
				int j= i+curr_len-1;
				// 1. The first and last character should match
				// 2. Rest of the substring should be a palindrome
				if(test.charAt(i)==test.charAt(j) && table[i+1][j-1]){
					table[i][j]= true;
					palindromeStartsAt=i;
					maxLen=curr_len;
				}
			}
		}
		return test.substring(palindromeStartsAt,maxLen+1);
	}
}
