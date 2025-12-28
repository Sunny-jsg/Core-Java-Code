package in.ramana;

public class Q43 {
	public static void main(String[] args) {
		String s1 ="ramana";
		String s2 ="";
		for(int i =0;i<s1.length();i++) {
			char ch = s1.charAt(i);
			if(s2.indexOf(ch)==-1) {
				s2 += ch;
			}
		}
		System.out.println(s2);
	}

}
