package in.basic;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		int sum = 0;
		int avg = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 Number");
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of  10 Numbers : " + sum);
		avg = sum / 10;
		System.out.println("Avg of 10 Numbers : " + avg);
	}

}
