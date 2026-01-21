package in.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sum {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[0-9]");
		Matcher m = p.matcher("a6370b4060c70d");
		int sum =0;
		while(m.find()) {
			sum += Integer.parseInt(m.group());
		}
		System.out.println(sum);
	}

}
