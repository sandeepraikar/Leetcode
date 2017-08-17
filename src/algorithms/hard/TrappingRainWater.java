package algorithms.hard;

public class TrappingRainWater {

	public static void main(String args[]){
		int arr[] ={0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(arr));
	}
	
	public static int trap(int height[]){
		int water = 0;
		if(height==null || height.length==0){
			return water;
		}
		
		int[] leftMax = new int[height.length];
		int[] rightMax = new int[height.length];
		//calculate left max
		for(int i=1;i<height.length;i++){
			leftMax[i]=Math.max(leftMax[i-1],height[i]);
		}
		//fill right array
		rightMax[height.length-1]=height[height.length-1];
		for(int j=height.length-2;j>=0;j--){
			rightMax[j]=Math.max(rightMax[j+1], height[j]);
		}
		
		for(int i=0;i<height.length;i++){
			water+=Math.min(leftMax[i], rightMax[i])-height[i];
		}
		return water;
		
	}
}
