package algorithms.medium;

/**
 * 
 * Follow up for "Unique Paths":

Now consider if some obstacles are added to the grids. How many unique paths would there be?

An obstacle and empty space is marked as 1 and 0 respectively in the grid.

For example,
There is one obstacle in the middle of a 3x3 grid as illustrated below.

[
  [0,0,0],
  [0,1,0],
  [0,0,0]
]
The total number of unique paths is 2.

Note: m and n will be at most 100.


 * @author Sandeep
 *
 */
public class UniquePaths2 {
	  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
	        int rows = obstacleGrid.length;
	        int cols = obstacleGrid[0].length;
	        for(int i=0;i<rows;i++){
	            for(int j=0;j<cols;j++){
	                if(obstacleGrid[i][j]==1){
	                    obstacleGrid[i][j]=0;
	                }
	                else if(i==0 && j==0){
	                    obstacleGrid[i][j]=1;
	                }
	                else if(i==0){
	                    obstacleGrid[i][j]= obstacleGrid[i][j-1]*1;
	                }
	                else if(j==0){
	                    obstacleGrid[i][j]= obstacleGrid[i-1][j]*1;
	                }else{
	                    obstacleGrid[i][j]=obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
	                }
	            }
	        }
	        return obstacleGrid[rows-1][cols-1];
	    }
}
