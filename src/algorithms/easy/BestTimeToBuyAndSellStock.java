package algorithms.easy;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int[] arr = { 10, 11, 12, 13, 14, 15, 16 };
		System.out.println(maxProfit(arr));

	}

	public static int maxProfit(int[] prices) {
		int bought=0;
		int maxProfit=0;
		if(prices.length==0){
			return maxProfit;
		}
		bought=prices[0];
		for(int i=0;i<prices.length;i++){
			if(prices[i]>bought){
				if(maxProfit<(prices[i]-bought)){
					maxProfit=(prices[i]-bought);
				}
			}else{
				bought=prices[i];
			}
		}
		return maxProfit;
	}
}
