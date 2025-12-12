package in.ramana;

import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int a = sc.nextInt();
		int[] arr = new int[a];
		System.out.println("Enter " + a + " numbers");
		for (int i = 0; i < a; i++) {
			int num = sc.nextInt();
			if (num % 2 == 0) {
				arr[i] = num;
			} else {
				arr[i] = 0;
			}
		}
		System.out.println("Even values in the array:");
		for (int x : arr) {
			if (x != 0)
				System.out.print(x + " ");
		}
	}

}
