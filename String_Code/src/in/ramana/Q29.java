package in.ramana;

public class Q29 {
	public static void main(String[] args) {
		String s1 = "ramana";
		String s2 = "";
		while (s1.length() > 0) {
			char ch = s1.charAt(0);
			s2 = s1.replace(ch + "", "");
			int count = s1.length() - s2.length();
			System.out.println("Occurrence of '" + ch + "' = " + count);
			s1 = s2;
		}
		
	}

}
