package in.sort;

public class Q1 {
	public static void main(String[] args) {
		int[] arr = { 54, 84, 12, 65, 3, 87, 32, 2, 89, 91, 70 };
		for (int i = 0; i < arr.length ; i++) {
			for (int j = 0; j < arr.length-1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
