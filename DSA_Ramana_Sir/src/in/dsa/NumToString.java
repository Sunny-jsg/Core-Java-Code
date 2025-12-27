package in.dsa;

public class NumToString {
	public static void main(String[] args) {
		int num = 13425563;
		pw(num / 10000000, " Crore ");
		pw((num / 100000) % 100, " Lakhs ");
		pw((num / 1000) % 100, " Thousand ");
		pw((num / 100) % 10, " Hundred ");
		pw(num % 100, "");

	}

	public static void pw(int n, String s) {
		String[] one = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
				"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

		String[] two = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
		if (n < 20) {
			System.out.print(one[n]);
		} else {
			System.out.print(two[n /= 10] + " " + one[n %= 10]);
		}
		if (n != 0) {
			System.out.print(s);
		}
	}

}
