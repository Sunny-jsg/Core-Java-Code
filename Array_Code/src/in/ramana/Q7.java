package in.ramana;

public class Q7 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 8, 10 };
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] % 2 == 0) {
				evenSum = evenSum + arr[i];

			} else {
				oddSum += arr[i];
			}
		}
		System.out.println("Sum of Even Element : " + evenSum);
		System.out.println("Sum of Odd Element : " + oddSum);
	}

}
