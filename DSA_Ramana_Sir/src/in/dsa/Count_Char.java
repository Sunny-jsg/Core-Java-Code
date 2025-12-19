package in.dsa;

public class Count_Char {
	public static void main(String[] args) {
		String s = "banana";
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '\u0000')
				continue;
			String index = i + "";
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					index = index + "," + j;
					ch[j] = '\u0000';
				}
			}
			System.out.println(ch[i] + " = " + index);
		}
	}

}
