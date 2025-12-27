package in.ramana;

public class Q39 {
	public static void main(String[] args) {
		String s = "java is very easy";
		String word = "";
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != ' ') {
				word = word + ch;
				count++;
			} else {
				System.out.print(word + " = " + count + " ");
				word = "";
				count = 0;
			}
		}
		System.out.println(word + " = " + count);
	}

}
