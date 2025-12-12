package in.method.jsp;

public class Demo2 {
	public static void main(String[] args) {
		String s1 = "Java is an oop";
		String[] s2 = s1.split(" ");
		for (String s3 : s2) {
			System.out.println(s3);
		}
	}

}
