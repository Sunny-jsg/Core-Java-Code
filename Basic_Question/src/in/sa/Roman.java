package in.sa;

import java.util.HashMap;

public class Roman {
	public static void main(String[] args) {
      int n =1220;
      String s = roman(n);
      System.out.println(s);
	}

	public static String roman(int num) {
		HashMap<Integer, String> m = new HashMap<>();
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
		int[] arr = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String s1 = "";
		for (int value : arr) {
			while(num >= value) {
				s1 += m.get(value);
				num = num - value;
			}
		}
		return s1;

	}

}
