package in.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Regular Expression ::");
			String re = sc.nextLine();
			System.out.println("Enter your String ::");
			String str = sc.nextLine();
			regex(re, str);
			System.out.println("Want to exit [Y/N]");
			String choice = sc.nextLine();
			if (choice.equalsIgnoreCase("Y")) {
				System.out.println("thanks for using program ...");
				break;
			}
		}

	}

	public static void regex(String re, String str) {
		Pattern p = Pattern.compile(re);
		Matcher m = p.matcher(str);
		boolean b = m.find();
		System.out.println(b);
	}

}
