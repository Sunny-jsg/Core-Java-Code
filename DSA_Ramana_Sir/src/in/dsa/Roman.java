package in.dsa;

import java.util.HashMap;
import java.util.Map;

public class Roman {
	public static void main(String[] args) {
		int n = 1220;
		System.out.println(numToRoman(n));

	}

	public static String numToRoman(int num) {
		Map<Integer, String> m = new HashMap<>();
		m.put(1, "I");
		m.put(4, "IV");
		m.put(5, "V");
		m.put(9, "IX");
		m.put(10, "X");
		m.put(40, "XL");
		m.put(50, "L");
		m.put(90, "XC");
		m.put(100, "C");
		m.put(400, "CD");
		m.put(500, "D");
		m.put(900, "CM");
		m.put(1000, "M");
		int[] a = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String result = "";
		for (int value : a) {
			while (num >= value) {
				result += m.get(value);
				num -= value;
			}
		}
		return result;
	}

}
