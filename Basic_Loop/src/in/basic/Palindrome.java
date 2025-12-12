package in.basic;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ::");
		int n = sc.nextInt();
		int temp =n;
		while(n >0) {
			int d =n%10;
			rev =rev *10 +d;
			n/=10;
		}
		if(temp == rev) {
			System.out.println(rev +" Palindrome Number");
		}
	}

}
