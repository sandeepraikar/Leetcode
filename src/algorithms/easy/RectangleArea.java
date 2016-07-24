package algorithms.easy;

/**
 * @author Sandeep
 *
 *Find the total area covered by two rectilinear rectangles in a 2D plane.

Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
Rectangle Area

Assume that the total area is never beyond the maximum possible value of int.

 */
public class RectangleArea {

	public static void main(String args[]) {
		System.out.println(computeArea(-3,0,3,4,0,-1,9,2));
	}

	public static int computeArea(int A, int B, int C, int D, int E, int F, int G,
			int H) {
		int left = Math.max(A, E);
		int right = Math.min(C, G);
		int top =  Math.min(D, H);
		int bottom =Math.max(B, F);
		
		int areaOfFirstRectangle = (C-A)*(D-B);
		int areaOfSecondRectangle = (G-E)*(H-F);
		int overLap=0;
		if(right>left && top>bottom){
			overLap= (right-left)*(top-bottom);
		}
		return areaOfFirstRectangle+areaOfSecondRectangle-overLap;
	}
}
