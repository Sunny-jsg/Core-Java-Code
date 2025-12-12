package in.sy;

public class LargestSubstringPalindrome {
	
	    public static void main(String[] args) {
	        String s = "babad";
	        String max = "";

	        for (int i = 0; i < s.length(); i++) {
	            for (int j = i + 1; j <= s.length(); j++) {
	                String sub = s.substring(i, j);
	                if (isPal(sub) && sub.length() > max.length()) {
	                    max = sub;
	                }
	            }
	        }

	        System.out.println("Largest Palindrome Substring: " + max);
	    }

	    public static boolean isPal(String s) {
	        int i = 0, j = s.length() - 1;
	        while (i < j) {
	            if (s.charAt(i) != s.charAt(j))
	                return false;
	            i++;
	            j--;
	        }
	        return true;
	    }
	


}
