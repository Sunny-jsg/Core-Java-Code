package in.sort;

import java.util.Arrays;

public class Inserstion_Sort {
	public static void main(String[] args) {
		int [] arr = {32, 65, 1, 54, 23};
		inserstionSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	public static void inserstionSort(int [] arr) {
		for(int i =1;i<arr.length;i++) {
			int key =arr[i];
			int j =i-1;
			while(j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}

}
