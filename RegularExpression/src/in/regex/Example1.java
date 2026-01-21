package in.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
	public static void main(String[] args) {
		// * is a quantifier that means: Zero or more occurrences of the preceding
		// character
		Pattern p = Pattern.compile("a*b");
		Matcher m1 = p.matcher("aab");
		Matcher m2 = p.matcher("b");
		Matcher m3 = p.matcher("ab");
		Matcher m4 = p.matcher("aaab");
		Matcher m5 = p.matcher("c");
		boolean b1 = m1.find();
		System.out.println(b1);
		boolean b2 = m2.find();
		System.out.println(b2);
		boolean b3 = m3.find();
		System.out.println(b3);
		boolean b4 = m4.find();
		System.out.println(b4);
		boolean b5 = m5.find();
		System.out.println(b5);
	}

}
