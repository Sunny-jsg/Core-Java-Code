package in.ramana;

public class Q34 {
	public static void main(String[] args) {
		String s = "madam";
		String smallest =null;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
			String s2 = s.substring(i, j);
				if (s2.length() >1 && isPalindrome(s2)) {
					System.out.println(s2);
					 if (smallest == null || s2.length() < smallest.length()) {
	                        smallest = s2;
	                    }
				}
			}
		}
		 if (smallest != null) {
	            System.out.println("Smallest Palindrome: " + smallest);
	        } else {
	            System.out.println("No palindrome found");
	        }

	}

	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;

			i++;
			j--;

		}
		return true;
	}

}
