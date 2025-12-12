package map_concept.in;

import java.util.LinkedHashMap;

public class Linked_HashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm =  new LinkedHashMap<>();
		lhm.put(101, "Radha");
		lhm.put(null, "Mohan");
		lhm.put(102,"Sita");
		lhm.put(103, "Ram");
		System.out.println(lhm);
	}

}
