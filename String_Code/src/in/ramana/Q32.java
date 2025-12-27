package in.ramana;

public class Q32 {
	public static void main(String[] args) {
		String s = "Malayalam";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String sub = s.substring(i, j);
				if (isPalindrome(sub) && sub.length() > 2) {
					System.out.println(sub);
				}
			}
		}
	}

	public static boolean isPalindrome(String s) {
		s = s.toLowerCase();
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
