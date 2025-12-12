package in.method;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 ="listen";
		String s2 = "Slient";
		String s3 = s1.toLowerCase();
		String s4 = s2.toLowerCase();
		char[] ch1 = s3.toCharArray();
		char[] ch2 = s4.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2)) {
			System.out.println(s1 + "," + s2 + " anagram ");
		}else {
			System.out.println("not a anagram");
		}
		
	}
  
}
