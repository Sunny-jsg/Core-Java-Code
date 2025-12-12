package in.sunny;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 3, 2, 6, 1 };
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			} else if (arr[i] > secondMax && arr[i] != max) {
				secondMax = arr[i]; // update second max
			}
		}
		System.out.println(secondMax);
	}

}
