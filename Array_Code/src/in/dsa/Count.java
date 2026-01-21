package in.dsa;

public class Count {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9, 11, 13 };
		int target = 7;
		int count = bs(arr, target);
		System.out.println("Total comparisons: " + count);

	}

	public static int bs(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		int count = 0;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			count++;
			if (arr[mid] < target) {
				start = mid + 1;

			} else if (arr[mid] > target) {
				end = mid - 1;
				
			} else {

				return count;
			}

		}
		return count;

	}

}
