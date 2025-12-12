package in.sunny;

import java.util.Arrays;

public class SortTheArray {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 3, 2, 6, 1 };
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp =arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
