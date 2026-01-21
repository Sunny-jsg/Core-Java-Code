package in.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEnrollment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Enrollment::");
		String s = sc.nextLine();
		Pattern p = Pattern.compile("^[\\d][\\w]+");
		Matcher m = p.matcher(s);
		if(m.matches()) {
			System.out.println("Valid Enrollment");
		}else {
			System.out.println("Invalid Enrollment");
		}
		
	}

}
