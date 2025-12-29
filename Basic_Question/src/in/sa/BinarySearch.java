package in.sa;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		int key = 17;
		int n = binary(arr, 0, arr.length - 1, key);
		System.out.println(n);
	}

	public static int binary(int[] arr, int start, int end, int key) {
		if (start > end) {
			return -1;
		}
		int mid = start + (end - start) / 2;
		if (arr[mid] == key) {
			return mid;
		} else if (arr[mid] < key) {
			return binary(arr, mid + 1, end, key);
		} else {
			return binary(arr, start, mid - 1, key);
		}
	}

}
