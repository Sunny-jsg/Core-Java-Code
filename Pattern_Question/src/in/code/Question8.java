package in.code;

import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Input values
		System.out.print("Input the first number of the G.P. series: ");
		int a = sc.nextInt();

		System.out.print("Input the number of terms in the G.P. series: ");
		int n = sc.nextInt();

		System.out.print("Input the common ratio of G.P. series: ");
		int r = sc.nextInt();

		int sum = 0;
		int term = a;

		System.out.print("The numbers for the G.P. series: ");

		for (int i = 1; i <= n; i++) {
			System.out.print(term);
			if (i < n) {
				System.out.print(" , ");
			}
			sum += term;
			term = term * r; // next term
		}

		System.out.println("\nThe Sum of the G.P. series : " + sum);

	}

}
