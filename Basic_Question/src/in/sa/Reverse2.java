package in.sa;

public class Reverse2 {
	public static void main(String[] args) {
		String s ="java is easy";
		String rev = rev(s);
		System.out.println(rev);
		
	}
	public static String rev(String s) {
		String temp ="";
		char[] ch = s.toCharArray();
		int i =0;
		int j=0;
		while(i<ch.length) {
			while(i< ch.length && ch[i] != ' ') i++;
			String s2 ="";
			for(int k =i-1;k>=j;k--) {
				s2 +=ch[k];
			}
			temp +=" ";
			temp +=s2;
			
			i++;
			j=i;
		}
		return temp.trim();
	}

}
