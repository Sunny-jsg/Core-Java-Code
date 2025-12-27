package in.ramana;

public class Q28 {
	public static void main(String[] args) {
		String s = "sunny";
		s = s.toLowerCase();
		char[] vowel = { 'a', 'e', 'i', 'o', 'u' };
		 System.out.print("Missing vowels: ");
		for (char c : vowel) {
			if (s.indexOf(c) == -1) {
				System.out.print(c + " ");
			}
		}
	}

}
