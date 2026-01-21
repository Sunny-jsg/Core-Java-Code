package in.sy;

public class CountSubArray {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 1, 6 };
		int key = 2;
		int x = 4;
		int c = countsubArray(arr, key, x);
		System.out.println(c);

	}

	public static int countsubArray(int[] arr, int k, int x) {
		int count = 0;
		int l = 0;
		int sum = 0;
		for (int r = 0; r < arr.length; r++) {
			sum += arr[r];

			if (r - l +1 == k) {
				if (sum / k == x) {
					count++;
				}
				sum -= arr[l];
				l++;
			}
		}

		return count;
	}

}
