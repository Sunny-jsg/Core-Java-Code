package in.method;

public class FindVowelAndConsonants {
	public static void main(String[] args) {
		String s1 = "Anita 123";
		int vowel = 0;
		int consonants = 0;
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o'
						|| ch == 'U' || ch == 'u') {
					vowel++;

				} else {
					consonants++;
				}
			}
		}
		System.out.println("Total Vowel :: " + vowel);
		System.out.println("Total Consonants :: " + consonants);
	}

}
