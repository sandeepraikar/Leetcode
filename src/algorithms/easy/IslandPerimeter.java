package algorithms.easy;

/**
 * You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells). The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

Example:

[[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]

Answer: 16
 * @author Sandeep
 *
 */
public class IslandPerimeter {

	 public int islandPerimeter(int[][] grid) {
	        if(grid==null || grid.length==0){
	            return 0;
	        }
	        int perimeter = 0;
	        for(int i=0;i<grid.length;i++){
	            for(int j=0;j<grid[i].length;j++){
	                if(!isValid(grid,i,j)) continue;
	                if(!isValid(grid,i-1,j)) perimeter++;
	                if(!isValid(grid,i+1,j)) perimeter++;
	                if(!isValid(grid,i,j-1)) perimeter++;
	                if(!isValid(grid,i,j+1)) perimeter++;
	            }
	        }
	        return perimeter;
	    }
	    
	    public boolean isValid(int[][] grid, int i, int j){
	        if(i>=grid.length || i<0 || j<0 || j>=grid[0].length || grid[i][j]==0){
	            return false;
	        }
	        return true;
	    }
	
}
