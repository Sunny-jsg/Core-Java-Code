package in.method.jsp;

public class Demo5 {
	public static void main(String[] args) {
		String s1 = "java is an oop lang";
		char[] ch = s1.toCharArray();
		String s2 = "";
		int i = 0;
		int j = 0;
		while (i < ch.length) {
			while (i < ch.length && ch[i] != ' ')
				i++;

			String temp = "";
			for (int k = i - 1; k >= j; k--) {
				temp += ch[k];
			}
			s2 += temp;
			if (i < ch.length)
				s2 += " ";
			i++;
			j = i;

		}
		System.out.println(s2);
	}

}
