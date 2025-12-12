package in.test;

import java.util.Scanner;

public class NumberOfDigit {
	public static void main(String[] args) {
		int num = 0, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ::");
		num = sc.nextInt();
		if (num < 0) {
			num = num * -1;
		} else if (num == 0) {
			num = 1;
		}
		while (num > 0) {
			num /= 10;
			count++;
		}
		System.out.println("Number of Digit in given Number is : " + count);
	}

}
