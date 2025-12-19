package in.ramana;

import java.util.Arrays;

public class Q1 {
	public static void main(String[] args) {
		String s1 = "sunny";
		char[] ch = s1.toCharArray();
		int i =0;
		int j=ch.length-1;
		while(i<j) {
		int temp = ch[j];
		ch[j]=ch[i];
		ch[i]= (char)temp;
		i++;
		j--;
	}
		System.out.print(Arrays.toString(ch)+" ");
	}
}
