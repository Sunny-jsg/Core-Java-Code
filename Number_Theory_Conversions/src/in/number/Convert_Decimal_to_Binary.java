package in.number;

import java.util.Scanner;

public class Convert_Decimal_to_Binary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Decimal Number::");
		int num = sc.nextInt();
		int place =1;
		int binary =0;
		while(num >0) {
			int rem = num%2;
			binary =binary + rem * place;
			num/=2;
			place *=10;
		}
		  System.out.println("Binary = " + binary);
	}

}
