package in.ramana;

public class Q26 {
	public static void main(String[] args) {
		String s = "Malayalam";
		int n = s.length();
		for (int len = 3; len <= n; len++) {
			for (int i = 0; i + len < n; i++) {
				System.out.print(s.substring(i, i + len) + "\t");
			}
			System.out.println(); // next row
		}

	}

}
