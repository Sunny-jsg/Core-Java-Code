package in.loop;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ::");
		int num = sc.nextInt();
		int rev =0;
		for(;num >0;num/=10) {
			rev=10*rev+num%10;
			
		}
		System.out.println(rev);
	}

}
