package in.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BikeRegistrationNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter BikeRegistration Number ::");
		String s = sc.nextLine();
		Pattern p = Pattern.compile("^[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}$");
		Matcher m = p.matcher(s);
		if (m.matches()) {
			System.out.println("Valid Registration Number ..");
		} else {
			System.out.println("Invalid Registration Number");
		}

	}

}
