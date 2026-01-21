package in.method;

public class Reverse {
	public static void main(String[] args) {
		String s = "0214638";
		String s3 = largestOddNum(s);
		System.out.println(s3);
	}

	public static String largestOddNum(String s) {
		for (int i = s.length() - 1; i >= 0; i--) {
			int digit = s.charAt(i) - '0';
			if (digit % 2 != 0) {
				String ans = s.substring(0, i + 1);
				int idx = 0;
				while (idx < ans.length() && ans.charAt(idx) == '0') {
					idx++;
				}

				return idx == ans.length() ? "" : ans.substring(idx);
			}
		}
		return "";
	}
}
