package in.number;

import java.util.Scanner;

public class Convert_Binary_to_Decimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary Number::");
		int num = sc.nextInt();
		int decimal = 0;
		int power = 1;
		while (num > 0) {
			int rem = num % 10;
			decimal += rem * power;
			power *= 2;
			num /= 10;

		}
		System.out.println("Decimal = " + decimal);

	}
}