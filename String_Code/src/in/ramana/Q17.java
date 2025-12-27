package in.ramana;

public class Q17 {
	public static void main(String[] args) {
		String s ="eye level car boy";
		String word ="";
		for(int i=0;i<s.length();i++) {
			  char ch = s.charAt(i);

	            if (ch != ' ') {
	                word = word + ch;
	            } else {
	                isPalindrome(word);
	                word = ""; // reset for next word
	            }
	        }
	        // check last word
	        isPalindrome(word);
	    }
	public static void isPalindrome(String s) {
		String s3 ="";
		char[] ch = s.toCharArray();
		for(int i =ch.length-1;i>=0;i--) {
			s3 = s3+ ch[i];
		}
		if(s.equals(s3)) {
			System.out.println(s);
		}
	}

}
