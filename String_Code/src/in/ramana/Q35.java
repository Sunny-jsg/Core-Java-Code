package in.ramana;

public class Q35 {
	public static void main(String[] args) {
		String a = "Sunny";
		String b = "Mohan";
		a = a + b;//"SunnyMohan"
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println(a);
		System.out.println(b);
	}

}
