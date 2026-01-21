package in.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountChar {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[^a-z A-Z]");
		Matcher m = p.matcher("Sunny123@gmail.com");
		int count = 0;
		while (m.find()) {
			System.out.println(m.start() + "=>" + m.end() + "=> " + m.group());
			count++;
		}
		System.out.println("Count :: " + count);
	}

}
