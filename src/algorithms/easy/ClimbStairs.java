package algorithms.easy;

/*
 * You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top? 
 * */
/**
 * @author Sandeep
 *
 */
public class ClimbStairs {
    public static int climbStairsIterative(int n) {
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int oneStepBefore =2;
        int twoStepBefore =1;
        int totalWays=0;
        for(int i=2;i<n;i++){
            totalWays = oneStepBefore+twoStepBefore;
            twoStepBefore = oneStepBefore;
            oneStepBefore = totalWays;
        }
        return totalWays;
    }
    private static int climbStairsRecursive(int i) {
		if(i==1){
			return 1;
		}
		if(i==2){
			return 2;
		}
		
		return climbStairsRecursive(i-1)+climbStairsRecursive(i-2);
	}
    
    public static void main(String[] args) {
		System.out.println(climbStairsRecursive(6));
		System.out.println(climbStairsIterative(6));
	}
}