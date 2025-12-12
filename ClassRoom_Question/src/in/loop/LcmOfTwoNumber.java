package in.loop;

import java.util.Scanner;

public class LcmOfTwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1 ::");
		int num1 = sc.nextInt();
		System.out.println("Enter Number 2 ::");
		int num2 = sc.nextInt();
		int lcm = (num1>num2)? num1:num2;
		while(true) {
			if(lcm%num1==0 && lcm%num2==0) {
				break;
			}
			lcm++;
		}
		System.out.println("LCM of " + num1 + " and " + num2 + " = " + lcm);

	}
}
