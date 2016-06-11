package algorithms.easy;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,3,5,7,9};
		int[] b={2,4,6,8,10};
		merge(a,a.length,b,b.length);
		
	}

	private static void merge(int[] nums1, int m, int[] nums2, int n) {
		int k=m+n-1;
		while(m-1>=0 && n-1>=0){
			if(nums1[m-1]>nums2[n-1]){
				nums1[k]=nums1[m-1];
				m--;
				k--;
			}else{
				nums1[k]=nums2[n-1];
				k--;
				n--;
				
			}
		}
		if(m-1>=0){
			while(m-1>=0){
				nums1[k]=nums1[m-1];
				k--;
				m--;
				
			}
		}
		if(n-1>=0){
			while(n-1>=0){
				nums1[k]=nums2[n-1];				
				k--;
				n--;
			}
		}
		
	}
	
	

	private static int[] merge(int[] a, int[] b) {
		int lenA= a.length;
		int lenB= b.length;
		int i=0,j=0,k=0;
		int[] newArr = new int[lenA+lenB];
		while(i<lenA && j<lenB){
			if(a[i]>b[j]){
				newArr[k]=b[j];
				j++;
			}else{
				newArr[k]=a[i];
				i++;
			}
			k++;
		}
		if(i<lenA){
			while(i<lenA){
				newArr[k]=a[i];
				i++;k++;
			}
		}
		
		if(j<lenB){
			while(j<lenB){
				newArr[k]=b[j];
				j++;k++;
			}
		}
		return newArr;
	}
	

}
