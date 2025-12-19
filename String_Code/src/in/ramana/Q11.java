package in.ramana;

public class Q11 {
	public static void main(String[] args) {
		String s = "Ankita";
		String vowel = "";
		char[] ch = s.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
					|| ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {

				vowel = vowel +ch[i]+" ";
				count++;
			}

		}
		System.out.println(count);
		System.out.println(vowel);
	}

}
