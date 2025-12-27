package in.ramana;

public class Q22 {
	public static void main(String[] args) {
		String s = "ramana";
		String s2 = "";
		while (s.length() > 0) {
			char ch = s.charAt(0);
			s2 = s.replace(ch + "", "");
			int count = s.length() - s2.length();
			if(count <=1) {
				System.out.print(ch);
			}
			s=s2;
		}
	}
}
