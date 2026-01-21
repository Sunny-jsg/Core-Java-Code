package in.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mobile_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pattern p = Pattern.compile("[6-9][0-9]{9}"); // compiled once

		while (true) {
			System.out.print("Enter Mobile-Number :: ");
			String s = sc.nextLine();

			Matcher m = p.matcher(s);

			if (m.matches()) {
				System.out.println("Valid Mobile Number");
			} else {
				System.out.println("Invalid Mobile Number");
			}

			System.out.print("Want to exit [Y/N] :: ");
			String choice = sc.nextLine();

			if (choice.equalsIgnoreCase("Y")) {
				System.out.println("Thanks for using program ...");
				break;
			}
		}
		sc.close();
	}
}
