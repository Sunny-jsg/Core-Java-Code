package in.ramana;

import java.util.Arrays;

public class Q2 {
	public static void main(String[] args) {
		String s ="SUnny";
		char[] ch = s.toCharArray();
		for(int i =0;i<ch.length-1;i++) {
			for(int j =0;j< ch.length-1-i;j++) {
				if(ch[j] > ch[j+1]) {
					char temp = ch[j+1];
					ch[j+1] =ch[j];
					ch[j] =temp;
					
				}
			}
		}
		System.out.print(Arrays.toString(ch) + " ");
	}

}
