package in.ramana;

public class Q4 {
	public static void main(String[] args) {
		String s = "Java is easy language";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if ((i == 0 && s.charAt(i) != ' ') ||
			 (s.charAt(i) != ' ' && s.charAt(i - 1) == ' ')) {
				count++;
			}
		}
		System.out.println("Word count: " + count);
	}

}
