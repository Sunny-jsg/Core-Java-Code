package in.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFormat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date ::");
		String s = sc.nextLine();
		Pattern p = Pattern.compile("[0123][0-9]-[01][0-9]-[0-9]{3}[0-9]");
		Matcher m = p.matcher(s);
		if (m.matches()) {
			System.out.println("Valid Date...");
		} else {
			System.out.println("Invalid Date...");
		}
	}

}
