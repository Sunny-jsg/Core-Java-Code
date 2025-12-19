package in.ramana;

public class Q42 {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 6, 8, 10, 15, 20 };
		int target = 8;
		int ans = binarySearch(arr, target);
		if (ans == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index: " + ans);
	}

	public static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = (start + (end - start) / 2);
			if (arr[mid] < target) {
				start = mid + 1;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				return mid;
			}

		}

		return -1;

	}

}
