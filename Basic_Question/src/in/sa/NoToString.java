package in.sa;

public class NoToString {
	public static void main(String[] args) {
		int n = 32933923;
		pw(n / 10000000, " Crore ");
		pw((n / 100000) % 100, " Lakhs ");
		pw((n / 1000 )% 100, " Thousand ");
		pw((n / 100 )% 10, " Hundred ");
		pw(n%100, "");

	}

	public static void pw(int num, String s) {
		String[] one = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
				"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

		String[] two = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
		if (num <= 19) {
			System.out.print(one[num]);
		} else {
			System.out.print(two[num /= 10] + " " + one[num % 10]);
		}
		if (num != 0) {
			System.out.print(s);
		}

	}
}