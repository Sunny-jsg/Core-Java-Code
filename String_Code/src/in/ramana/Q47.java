package in.ramana;

public class Q47 {

	public static void main(String[] args) {

		String s = "abeijho";
		int vowelCount = 0;

		for (int i = 0; i < s.length(); i++) {
			if ("aeiou".indexOf(s.charAt(i)) != -1) {
				vowelCount++;
			}
		}

		if (vowelCount > 3) {
			s = s.replaceAll("[aeiou]", "_");
		}

		System.out.println(s); // _b__jh_
	}

}
