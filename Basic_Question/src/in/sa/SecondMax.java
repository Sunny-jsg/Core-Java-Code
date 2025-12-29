package in.sa;

public class SecondMax {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int max = arr[0][0];
		int secondMax = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int val = arr[i][j];
				if (val > max) {
					secondMax = max;
					max = val;
				} else if (val > secondMax && val != max) {
					secondMax = val;
				}
			}
		}
		System.out.println(secondMax);
	}

}
