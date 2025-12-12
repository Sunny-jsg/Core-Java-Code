package in.sunny;

public class CountVowels {
	public static void main(String[] args) {
		String s1 = "radhika";
		int count = count(s1);
		System.out.println("Vowel Count: " + count);
		String removed = removeVowel(s1);
		System.out.println("After Removing Vowels: " + removed);

	}

	public static int count(String s) {
		int count = 0;
		char[] ch = s.toCharArray();
		for (int i = 0; i <= ch.length - 1; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				count++;
			}
		}
		return count;
	}

	public static String removeVowel(String s) {
		String s2 = "";
		char[] ch = s.toCharArray();
		for (int i = 0; i <= ch.length - 1; i++) {
			if (!(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')) {
				s2 += ch[i];
			}

		}
		return s2;
	}

}
