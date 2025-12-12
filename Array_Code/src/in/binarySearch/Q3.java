package in.binarySearch;

public class Q3 {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
		int target =15;
		int ans = isBinary(arr, target);
		System.out.println(arr[ans]);
	}

	static int isBinary(int[] arr, int target) {
		
		int s = 0;
		int e = arr.length - 1;
		
		while (s <= e) {

			int mid = s + (e - s) / 2;
			if (arr[mid] > target) {
				e = mid - 1;
			} else if (arr[mid] < target) {
				s = mid + 1;
			} else {
				return mid;
			}
		}
		return s;

	}

}
