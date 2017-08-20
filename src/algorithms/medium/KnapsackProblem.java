package algorithms.medium;

public class KnapsackProblem {

	public static void main(String args[]){
		int targetWeight= 10;
		int[] weight = {2,2,4,5};
		int[] val = {3,7,2,9};
		
		//recursive solution
		int result = findOptimalItemsRecursive(targetWeight, 0, weight, val);
		System.out.println(result);
		
		//Iterative solution
		int result2 = findOptimalItemsIterative(targetWeight,weight,val);
		System.out.println(result2);
	}

	private static int findOptimalItemsIterative(int targetWeight,
			int[] weight, int[] val) {
		int[][] matrix = new int[val.length+1][targetWeight+1];
		for(int i=0;i<=val.length;i++){
			for(int j=0;j<=targetWeight;j++){
				if(i==0 || j==0){
					matrix[i][j]=0;
					continue;
				}
				if(j-weight[i-1]>=0){
					matrix[i][j] = Math.max(matrix[i-1][j], val[i-1]+ matrix[i-1][j-weight[i-1]] );
				}else{
					matrix[i][j] = matrix[i-1][j];
				}
			
			}
		}
		
		return matrix[val.length][targetWeight];
	}

	private static int findOptimalItemsRecursive(int targetWeight, int i, int[] weight,
			int[] val) {
		if(targetWeight == 0 || i== weight.length){
			return 0;
		}
		if(weight[i]>targetWeight){
			return findOptimalItemsRecursive(targetWeight,i+1,weight,val);
		}
		int includeWeight = val[i]+ findOptimalItemsRecursive(targetWeight-weight[i],i+1,weight,val);
		int excludeWeight = findOptimalItemsRecursive(targetWeight,i+1,weight,val);
	
		return Math.max(includeWeight, excludeWeight);
	}
}
