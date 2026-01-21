package in.sy;

public class MaximumSum {
	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 1, 3, 2 };
		int key = 3;
		int sum = sum(arr, key);
		System.out.println(sum);
	}

	public static int sum(int[] arr, int k) {
		int MaxSum = 0;
		int WindowSum = 0;
		int l = 0;
		for (int r = 0; r < arr.length; r++) {
			WindowSum += arr[r];
			if (r - l + 1 == k) {
				MaxSum = Math.max(MaxSum, WindowSum);
				WindowSum -= arr[l];
				l++;
			}
		}

		return MaxSum;
	}

}
