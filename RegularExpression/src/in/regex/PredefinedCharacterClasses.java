package in.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PredefinedCharacterClasses {
	public static void main(String[] args) {

        String input = "a9 @\tZ#.";

        Pattern p1 = Pattern.compile("\\s"); // whitespace
        Pattern p2 = Pattern.compile("\\S"); // non-whitespace
        Pattern p3 = Pattern.compile("\\d"); // digit
        Pattern p4 = Pattern.compile("\\D"); // non-digit
        Pattern p5 = Pattern.compile("\\w"); // word character
        Pattern p6 = Pattern.compile("\\W"); // non-word character
        Pattern p7 = Pattern.compile(".");   // any character

        System.out.println("Input String: " + input);
        System.out.println("--------------------------------");

        printMatches("Whitespace \\s", p1.matcher(input));
        printMatches("Non-Whitespace \\S", p2.matcher(input));
        printMatches("Digit \\d", p3.matcher(input));
        printMatches("Non-Digit \\D", p4.matcher(input));
        printMatches("Word \\w", p5.matcher(input));
        printMatches("Non-Word \\W", p6.matcher(input));
        printMatches("Any character .", p7.matcher(input));
    }

    // Common method to print matcher results
    public static void printMatches(String title, Matcher m) {
        System.out.println(title + " Matches:");
        while (m.find()) {
            System.out.println("  " + m.group() + " at index " + m.start());
        }
        System.out.println();
    }
}
