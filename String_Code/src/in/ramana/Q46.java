package in.ramana;

public class Q46 {
	public static void main(String[] args) {

		String s = "class";
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (result.indexOf(c) == -1) {
				if (c == 's') {
					result = s.replace(c + "", "$");
					continue;
				}
				result += c; 
			} 
		}

		System.out.println(result); // cla$$
	}

}
