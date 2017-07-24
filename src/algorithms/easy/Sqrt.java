package algorithms.easy;
/**
 * Implement int sqrt(int x).

Compute and return the square root of x.

 * @author Sandeep
 *
 */
public class Sqrt {

	public static void main(String[] args) {
		System.out.println(mySqrt(5));

	}
	
	 public static int mySqrt(int x) {
	        long i=0;
	        long j=x/2+1;
	        while(i<=j){
	            long mid = (i+j)/2;
	            if(mid*mid==x){
	                return (int)mid;
	            }
	            if(mid*mid<x){
	                i=mid+1;
	            }else{
	                j=mid-1;
	            }
	        }
	        return (int)j;
	    }

}
