package in.j_Spider;

import java.util.Arrays;

public class RemoveDuplicateNumber {
	public static void main(String[] args) {
		int[] arr = { 2, 1, 3, 3, 2, 1, 5, 4 };
		int[] a = Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(a));
	}

}
