package in.ramana;

public class Q23 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abcdefghijklmnopqrstuvwxyz";
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		for (int i = 0; i < ch2.length; i++) {
			boolean found = false;
			for (int j = 0; j < ch1.length; j++) {
				if (ch2[i] == ch1[j]) {
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.print(ch2[i] + " ");
			}
		}
	}
}
