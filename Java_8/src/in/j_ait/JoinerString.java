package in.j_ait;

import java.util.StringJoiner;

public class JoinerString {
	public static void main(String[] args) {
		StringJoiner s1 = new StringJoiner("-");
		s1.add("Sunny");
		s1.add("Yadav");
		s1.add("Jharsuguda");
		System.out.println(s1);

		StringJoiner s2 = new StringJoiner("-", "[", "]");
		s2.add("Sunny");
		s2.add("Yadav");
		s2.add("Jharsuguda");
		System.out.println(s2);
	}

}
