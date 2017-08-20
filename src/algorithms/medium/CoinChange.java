package algorithms.medium;

public class CoinChange {
	 public int coinChange(int[] coins, int amount) {
	       return helper(coins, amount , new int[amount]);
	    }
	    
	    public int helper(int[] coins, int remaining, int[] count){
	        if(remaining<0){
	            return -1;
	        }
	        if(remaining ==0){
	            return 0;
	        }
	        
	        if(count[remaining-1]!=0){
	            return count[remaining-1]; // already computed
	        }
	        int min = Integer.MAX_VALUE;
	        for(int curr: coins){
	            int result = helper(coins, remaining-curr, count);
	            if(result>=0 && result<min){
	                min= result+1;
	            }
	        }
	        count[remaining-1] = (min==Integer.MAX_VALUE)?-1:min;
	        return count[remaining-1];
	    }
}
