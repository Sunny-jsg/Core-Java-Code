package in.binarySearch;

public class Q7 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 4, 3, 2, 1 };
		/*
		 * int max = arr[0]; for (int i = 0; i < arr.length; i++) { if (max < arr[i]) {
		 * max = arr[i]; } } System.out.println(max);
		 */
		int ans = peakNumber(arr);
		System.out.println(arr[ans]);
	}

	public static int peakNumber(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start <end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1]) {
				end = mid;
			} else  {
				start = mid+1;
			}

		}
		return end;
	}

}
