package in.ramana;

import java.util.ArrayList;

public class Q30 {
	public static void main(String[] args) {
		String s1 = "java is very easy";
		ArrayList<String> al = new ArrayList<>();
		String word = "";
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != ' ') {
				word += s1.charAt(i);
			} else {
				al.add(word);
				word = "";
			}
		}
		al.add(word);
		String[] arr = al.toArray(new String[0]);
		for (String str : arr) {
			System.out.println(str);
		}
	}

}
