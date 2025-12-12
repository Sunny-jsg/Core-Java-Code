package in.method;

public class Example5 {
	public static void main(String[] args) {
		String s1 = new String("Sunny");
		String s2 = new String("Mohan");
		String s3 = "Sunny";
		String s4 = "Mohan";
		System.out.println(s1 == s3);
		System.out.println(s1==s2);
		System.out.println(s1== s4);
		System.out.println(s3 == s4);
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
	}

}
/*
 * equals(Object another)
 * 
 * 👉 Compares two strings for exact match (case-sensitive).
 */