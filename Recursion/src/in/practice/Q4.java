package in.practice;

public class Q4 {
	public static void main(String[] args) {
		System.out.println(sumOfDigit(321));
	}

	public static int sumOfDigit(int n) {
		
		if (n <= 0)
			return 0;

		return (n % 10) + sumOfDigit(n / 10);

	}

}
