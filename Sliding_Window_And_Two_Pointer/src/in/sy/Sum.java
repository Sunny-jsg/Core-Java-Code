package in.sy;

public class Sum {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 1, 5 };
		int k = 3;
		findSubarraySum(arr, k);
	}

	public static void findSubarraySum(int[] arr, int K) {
		int n = arr.length;
		int windowSum = 0;
		int l = 0;
		for (int r = 0; r < n; r++) {
			windowSum += arr[r];
			if (r - l + 1 == K) {
				System.out.print(windowSum + " ");
				windowSum -= arr[l];
				l++;

			}
		}

	}
}