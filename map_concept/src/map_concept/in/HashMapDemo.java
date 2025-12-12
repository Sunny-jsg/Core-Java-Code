package map_concept.in;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(101, "Sachin");
		hm.put(null, "Mohan");
		hm.put(102, "Sita");
		hm.put(103, "Laxman");
		System.out.println(hm);
		System.out.println(hm.size());
		Set<Integer> ks = hm.keySet();
		System.out.println(ks);
		Collection<String> values = hm.values();
		System.out.println(values);
		Set<Entry<Integer, String>> entrySet = hm.entrySet();
		System.out.println(entrySet);
		System.out.println(hm.containsKey(103));
		System.out.println(hm.containsValue("Sita"));
		System.out.println(hm);

	}
}