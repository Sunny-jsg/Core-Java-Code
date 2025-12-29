package in.sa;

public class Reverse {
	public static void main(String[] args) {
		String s = "java is very easy";
		String rev = rev(s);
		System.out.println(rev);
	}

	public static String rev(String s) {
		String temp = "";
		char[] ch = s.toCharArray();
		int i = ch.length - 1;
		int j = ch.length - 1;
		while (i >= 0) {
			while (i >= 0 && ch[i] != ' ')
				i--;
			String s2 = "";
			for (int k = i + 1; k <= j; k++) {
				s2 += ch[k];
			} 
			
			temp += s2;
			temp +=" ";
			i--;
			j = i;
		}
		return temp.trim();
	}

}
