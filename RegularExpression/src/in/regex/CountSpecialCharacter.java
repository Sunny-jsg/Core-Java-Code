package in.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSpecialCharacter {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[^a-z-A-Z-0-9]");
		Matcher m = p.matcher("ab c$123#iJk^45 6*pQr @ wXYz");
		int count = 0;
		while (m.find()) {
			System.out.print(m.group() + " ");
			count++;
			
		}
		System.out.println();
		System.out.println("Count ::" + count);
	}

}
