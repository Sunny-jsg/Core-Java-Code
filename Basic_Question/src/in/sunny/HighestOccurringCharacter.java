package in.sunny;

public class HighestOccurringCharacter {
	public static void main(String[] args) {
		String s = "success";
		findHighestChar(s);
	}

	public static void findHighestChar(String s) {
		int frequency = 0;
		char highestChar = ' ';

		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}

			}
			if (count > frequency) {
				frequency = count;
				highestChar =ch[i];
			}

		}
		System.out.println("Highest occurring character: " + highestChar);
		System.out.println("Frequency: " + frequency);
	}

}
