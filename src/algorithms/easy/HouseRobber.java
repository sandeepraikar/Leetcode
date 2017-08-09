package algorithms.easy;

/**
 * You are a professional robber planning to rob houses along a street. Each
 * house has a certain amount of money stashed, the only constraint stopping you
 * from robbing each of them is that adjacent houses have security system
 * connected and it will automatically contact the police if two adjacent houses
 * were broken into on the same night.
 * 
 * Given a list of non-negative integers representing the amount of money of
 * each house, determine the maximum amount of money you can rob tonight without
 * alerting the police.
 * 
 * @author Sandeep
 *
 */
public class HouseRobber {
	public int rob(int[] nums) {
		int maxProfit = 0;
		int oddProfit = 0;
		int evenProfit = 0;
		if (nums.length == 0) {
			return maxProfit;
		}
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				evenProfit = Math.max(evenProfit + nums[i], oddProfit);
			} else {
				oddProfit = Math.max(oddProfit + nums[i], evenProfit);
			}
		}

		return Math.max(oddProfit, evenProfit);
	}
}
