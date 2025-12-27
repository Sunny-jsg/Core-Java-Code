package in.ramana;

public class Q15 {
	public static void main(String[] args) {
		String s1 = "india that is bharat";
		String s2 = "";
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
				s2 = s2 + Character.toUpperCase(ch[i]);
			} else {
				s2 = s2 + Character.toLowerCase(ch[i]);
			}
		}
		System.out.println(s2);
	}
}
