package in.ramana;

public class Q9 {
	public static void main(String[] args) {
		char[] ch = { 'a', 'b', 'c', 'd', 'e', 'i', 'o', 'u', 't' };
		for (int i = 0; i <= ch.length - 1; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				System.out.print(ch[i] + " ");
			}
		}
	}

}
