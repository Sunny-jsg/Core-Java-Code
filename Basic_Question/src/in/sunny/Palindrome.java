package in.sunny;

public class Palindrome {
	public static void main(String[] args) {
		String s1 = "Madam";
       boolean ans = isPalindrome(s1);
       System.out.println(ans);
	}

	public static boolean isPalindrome(String s) {
		String s2 = "";
		char[] ch = s.toLowerCase().toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			s2 += ch[i];
		}
		if (s .equalsIgnoreCase(s2)) {
			return true;
		}

		return false;
	}
}
