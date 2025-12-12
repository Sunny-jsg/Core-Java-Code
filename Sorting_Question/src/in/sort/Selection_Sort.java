package in.sort;

import java.util.Arrays;

public class Selection_Sort {
	public static void main(String[] args) {
		int [] arr = {8,7,3,2,1,6};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void selectionSort(int[] arr) {
		for(int i =0;i<arr.length-1;i++) {
			int index =i;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<arr[index])
					index =j;
			}
			if(i != index) {
				int temp = arr[index];
				arr[index] =arr[i];
				arr[i]=temp;
			}
		}
		
	}

}
