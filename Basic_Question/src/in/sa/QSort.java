package in.sa;

import java.util.Arrays;

public class QSort {
	public static void main(String[] args) {
		
	        int[] arr = { 3, 2, 1, 5, 4 };
	        quickSort(arr, 0, arr.length - 1);
	        System.out.println(Arrays.toString(arr));
	    }

	
	public static void quickSort(int [] a,int start ,int end) {
		while(start >= end) return ;
		int i=start, j=end;
		int pivot = a[(start+end)/2];
		while(i<=j) {
			while(a[i]< pivot) i++;
			while(a[j]> pivot) j--;
			if(i<=j) {
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
				
			
		}
		quickSort(a, start, j);
		quickSort(a, i, end);
	}

}
