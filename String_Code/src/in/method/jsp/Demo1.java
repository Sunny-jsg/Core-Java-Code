package in.method.jsp;

public class Demo1 {
	public static void main(String[] args) {
		String s1 = "a23f456j1235";
		int sum = 0;
		int num = 0;
		char[] ch = s1.toCharArray();

		for (char c : ch) {
			if (c >= '0' && c <= '9') {
				num = num * 10 + (c - '0');

			} else {
				sum += num;
				num = 0;
			}
		}
		sum += num;
		System.out.println(sum);
	}

}
