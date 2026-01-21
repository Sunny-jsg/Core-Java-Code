package in.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GmailPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter Gmail ::");
			String s = sc.nextLine();
			Pattern p = Pattern.compile("^[a-z][a-z0-9._]+@gmail\\.com$");

			Matcher m = p.matcher(s);
			if (m.matches()) {
				System.out.println("Valid Email");
			} else {
				System.out.println("Invalid Email");
			}

			System.out.println("Want to exit(Y/N)");
			String choice = sc.nextLine();
			if (choice.equalsIgnoreCase("Y")) {
				System.out.println("Thanks for using program ...");
				break;
			}
		}

	}

}
