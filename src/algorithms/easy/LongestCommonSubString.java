package algorithms.easy;

public class LongestCommonSubString {

	public static void main(String[] args) {
		System.out.println(longestCommonSubstring("afgvvbwer", "qwefgvvxhsd"));
		
	}

	private static int longestCommonSubstring(String w1, String w2) {
		int tempMatrix[][]=new int[w1.length()+1][w2.length()+1];
		int max=0;
		for(int i=1;i<w1.length();i++){
			for(int j=1;j<w2.length();j++){
				if(w1.charAt(i-1)==w2.charAt(j-1)){
					tempMatrix[i][j]=tempMatrix[i-1][j-1]+1;
					if(max<tempMatrix[i][j]){
						max=tempMatrix[i][j];
					}
				}
			}
		}
		
		return max;
	}
	

}
