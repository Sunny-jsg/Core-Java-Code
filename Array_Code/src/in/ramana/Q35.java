package in.ramana;

import java.util.Arrays;

//write a java program to shift half of the element to the right side of the array.
public class Q35 {
	public static void main(String[] args) {
		int[] arr1 = { 2, 5, 8, 9, 3, 1 };
		int[] arr2 = new int[arr1.length];
		int index = 0;
		int mid = arr1.length / 2;
		for (int i = mid; i < arr1.length; i++) {
			arr2[index] = arr1[i];
			index++;
		}
		for (int j = 0; j < arr1.length / 2; j++) {
			arr2[index] = arr1[j];
			index++;
		}
		System.out.println(Arrays.toString(arr2));
	}

}
