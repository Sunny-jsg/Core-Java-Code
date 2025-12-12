package in.ramana;

public class Q10 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		for (int i = 0; i <= arr.length - 1; i++) {
			if (isPrime(arr[i])) {
				System.out.print(arr[i] + " ");
			}
		}

	}

	public static boolean isPrime(int num) {
		if (num <=1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
