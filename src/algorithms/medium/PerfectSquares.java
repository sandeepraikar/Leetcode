package algorithms.medium;

public class PerfectSquares {
	   public int numSquares(int n) {
		     
	        int[] perfectSquares = new int[n+1];
	        for(int i=1;i<=n;i++){
	            perfectSquares[i]= Integer.MAX_VALUE;
	        }
	        
	        for(int i=1;i<=n;i++){
	            int sqrt =(int) Math.sqrt(i);
	            if(sqrt*sqrt==i){
	                perfectSquares[i]=i;
	            }
	            for(int j=1;j<=sqrt;j++){
	                int diff = i-j*j;
	                perfectSquares[i]=Math.min(perfectSquares[i], perfectSquares[diff]+1);
	            }
	        }
	        return perfectSquares[n];
	    }
}
