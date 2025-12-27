package in.jspider;

public class Q10 {
	public static void main(String[] args) {
		int[][] arr = { { 12, 35, 40 }, { 55, 23, 65 }, { 93, 87, 10 } };
		int min = arr[0][0];
		int max = arr[0][0];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (min > arr[row][col]) {
					min = arr[row][col];
				}
				if (max < arr[row][col]) {
					max = arr[row][col];
				}
			}
		}
		System.out.println("Minimum Value :: " + min);
		System.out.println("Maximum Value :: " + max);
	}

}
