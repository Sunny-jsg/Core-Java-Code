package in.test;

import java.util.Scanner;

public class OddEvenNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ::");
		int i = sc.nextInt();
		checkOddEven(i);
	}
	
	public static void checkOddEven(int n) {
		if(n%2==0) {
			System.out.println("Even Number ::");
		}else {
			System.out.println("Odd Number ::");
		}
	}

}
