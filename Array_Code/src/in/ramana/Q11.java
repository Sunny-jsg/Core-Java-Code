package in.ramana;

public class Q11 {
	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 0, 3, 0, 4, 0, 5, 0 };
		int count = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
