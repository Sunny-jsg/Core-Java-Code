package in.regex.ques;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchAllDigit {
	public static void main(String[] args) {
		String input = "Interview";

		Pattern p = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(input);
		int count = 0;
		while (m.find()) {
			System.out.println(m.group());
			count++;
		}
		System.out.println("Vowel Count ::" + count);
	}

}
