package in.ramana;

public class Q14 {
	public static void main(String[] args) {
		String s = "RaMana";// output : rAmANA
		String s1 = "";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				s1 = s1 + Character.toLowerCase(ch[i]);
			} else {
				s1 = s1 + Character.toUpperCase(ch[i]);
			}
		}
		System.out.print(s1 + " ");
	}

}
