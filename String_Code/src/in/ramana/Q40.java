package in.ramana;

public class Q40 {
	public static void main(String[] args) {
		String s1 ="java programming";
		String s2 ="";
		while(s1.length()>0) {
			char ch = s1.charAt(0);
			s2 =s1.replace(ch+"", "");
			int count = s1.length()-s2.length();
			if(count > 2) {
				System.out.println(ch + " = " + count);
			}
			s1=s2;
		}
	}

}
