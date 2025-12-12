package in.sunny;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountCharFrequency {
	public static void main(String[] args) {
		String s1 = "hello World";

		count(s1);
	}

	public static void count(String s) {
		s=s.replace(" ", "");
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		for (char c : s.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0) + 1);

		}
		Set<Entry<Character, Integer>> es = hm.entrySet();
		Iterator<Entry<Character, Integer>> it = es.iterator();
		while (it.hasNext()) {
			Entry<Character, Integer> value = it.next();
			System.out.println(value);
		}
	}

}
