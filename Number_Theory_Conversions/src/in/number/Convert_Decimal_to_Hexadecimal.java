package in.number;

import java.util.Scanner;

public class Convert_Decimal_to_Hexadecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number::");
		int num = sc.nextInt();
		System.out.println("Hexadecimal = " + Integer.toHexString(num).toUpperCase());
		System.out.println("Octal Number = " + Integer.toOctalString(num).toUpperCase());
		System.out.println("Binary Number = " + Integer.toBinaryString(num).toUpperCase());
	}

}
