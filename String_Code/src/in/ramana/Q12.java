package in.ramana;

public class Q12 {
	public static void main(String[] args) {
		String s = "sunny";
		char[] ch = s.toCharArray();
		int maxCount = 0;
		int minCount = ch.length;
		char maxChar = 0;
		char minChar = 0;

		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			boolean countChar = false;

			for (int j = 0; j < i; j++) {
				if (ch[i] == ch[j]) {
					countChar = true;
					break;
				}

			}
			if (countChar)
				continue;
			for (int k = 0; k < ch.length; k++) {
				if (ch[i] == ch[k]) {
					count++;
				}
			}
			System.out.println(ch[i] + " = " + count);

			if (count > maxCount) {
				maxCount = count;
				maxChar = ch[i];
			}
			if (count < minCount) {
				minCount = count;
				minChar = ch[i];

			}

		}
		System.out.println("Maximum Occurrence: " + maxChar + " = " + maxCount);
		System.out.println("Minimum Occurrence: " + minChar + " = " + minCount);
	}

}
