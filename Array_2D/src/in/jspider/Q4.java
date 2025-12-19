package in.jspider;

public class Q4 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sum = 0;
		int length = arr.length;
		for (int i = 0; i < arr.length; i++) {

			sum += arr[i][i];
			if (length % 2 != 0 && i == length / 2)
				continue;
			sum += arr[i][length - 1 - i];

		}
		System.out.println(sum);

	}

}
