package in.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountDigit {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[0-9]");
		Matcher m = p.matcher("su55nny18u9");
		int c = 0;
		int sum = 0;
		while (m.find()) {
			int start = m.start();
			int end = m.end();
			String group = m.group();
			sum = sum + Integer.parseInt(m.group());
			c++;
			System.out.println("Starting index of digit :: " + start );
			System.out.println("Ending index (start + 1 here) :: " + end );
			System.out.print("The digit found :: " + group);
			System.out.println();
		}
		System.out.println("Sum =" + sum);
		System.out.println("count=" + c);

	}

}
