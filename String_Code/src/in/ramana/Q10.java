package in.ramana;

import java.util.Arrays;

public class Q10 {
	public static void main(String[] args) {
		String s ="Ramana";
		char[] ch = s.toCharArray();
		for(int i =0;i<ch.length;i++) {
			if(ch[i] == 'a') {
				ch[i]='@';
			}
		}
		for(char c : ch) {
			System.out.print(c + " ");
		}
	}

}
