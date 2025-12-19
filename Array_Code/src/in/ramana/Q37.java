package in.ramana;

public class Q37 {
	static String[] ones = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

	static String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

	public static void main(String[] args) {
		int num = 2917;
		System.out.println(convert(num));
	}

	static String convert(int num) {
		if (num == 0)
			return "zero";

		String result = "";

		if (num >= 1000) {
			result += ones[num / 1000] + " thousand ";
			num %= 1000;
		}
		if (num >= 100) {
			result += ones[num / 100] + " hundred ";
			num %= 100;
		}
		if (num >= 20) {
			result += tens[num / 10] + " ";
			num %= 10;
		}
		if (num > 0) {
			result += ones[num];
		}

		return result.trim();
	}

}
