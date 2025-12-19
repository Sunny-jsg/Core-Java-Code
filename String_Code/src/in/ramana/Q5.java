package in.ramana;

public class Q5 {
	public static void main(String[] args) {
		String s = "naman";
		boolean palindrome = isPalindrome(s);
		if (palindrome) {
			System.out.println(s + " is a Palindrome String");
		} else {
			System.out.println("Not palindrome :: ");
		}
	}

	public static boolean isPalindrome(String s) {
		String s2 = "";
		char[] ch = s.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			s2 += ch[i];
		}

		return s.equals(s2);
	}

}
