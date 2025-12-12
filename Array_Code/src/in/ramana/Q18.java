package in.ramana;

public class Q18 {
	public static void main(String[] args) {
		int[] arr = { 0, 2, 3, 2, 4, 1 };
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (max < arr[i]) {
				secondMax = max;
				max = arr[i];
			} else if (arr[i] > secondMax && arr[i] != max) {
				secondMax = arr[i];
			}

		}
		System.out.println("Max = " + max);
        System.out.println("Second Max = " + secondMax);

	}

}
