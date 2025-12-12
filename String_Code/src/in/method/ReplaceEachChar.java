package in.method;

public class ReplaceEachChar {
	public static void main(String[] args) {
		String s = "Hello World";
		String s2 = "";
		char[] ch = s.toCharArray();
		for (char i = 0; i <= ch.length - 1; i++) {

			char c = s.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				c++;
				s2 += c;
			} else if (c >= 'a' && c <= 'z') {
				c++;
				s2 += c;
			} else {

				s2 += " ";
			}
		}
		System.out.println(s2);

	}
}
