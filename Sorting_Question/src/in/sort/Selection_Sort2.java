package in.sort;

import java.util.Arrays;

public class Selection_Sort2 {
	public static void main(String[] args) {
		int [] arr = {32, 65, 1, 54, 23};
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void sort(int [] arr) {
		for(int i =0;i<arr.length-1;i++) {
			int index =i;
			for(int j=i;j<arr.length;j++) {
				if(arr[j] <arr[index]) {
					index =j;
				}
			}
			if(i != index) {
				int temp = arr[index];
				arr[index] =arr[i];
				arr[i] = temp;
			}
		}
	}

}
