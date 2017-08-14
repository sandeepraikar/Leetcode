package algorithms.easy;
/**
 * You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Follow up:
Could you do this in-place?
 * @author Sandeep
 *
 */
public class RotateImage {
	 public void rotate(int[][] matrix) {
		 //Find Transpose of the matrix 
	        for(int i = 0; i<matrix.length; i++){
	            for(int j = i; j<matrix[0].length; j++){
	                int temp = 0;
	                temp = matrix[i][j];
	                matrix[i][j] = matrix[j][i];
	                matrix[j][i] = temp;
	            }
	        }
	        // Flip the elements row wise
	        for(int i =0 ; i<matrix.length; i++){
	            for(int j = 0; j<matrix.length/2; j++){
	                int temp = 0;
	                temp = matrix[i][j];
	                matrix[i][j] = matrix[i][matrix.length-1-j];
	                matrix[i][matrix.length-1-j] = temp;
	            }
	        }
	    }
	        
}
