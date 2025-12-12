package in.method.jsp;

public class Duplicate {
	public static void main(String[] args) {
		String s ="developer";
		String s2 ="";
		while(s.length()>0) {
			char ch = s.charAt(0);
			s2 =s.replace(ch+"", "");
			int count = s.length()-s2.length();
			if(count > 1) {
			System.out.println(ch + " = " + count );
			}
			s =s2;
		}
		
		
	}

}
