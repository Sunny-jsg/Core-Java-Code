package map_concept.in;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableMap {
	public static void main(String[] args) {
		Hashtable<String, Integer> ht = new Hashtable<>();
		ht.put("Sachin", 200);
		ht.put("Rohit", 264);
		ht.put("Sehwagh", 219);
		ht.put("Dhoni", 183);
		ht.put("Ganguly", 183);
		System.out.println(ht);
		Enumeration<String> keys = ht.keys();
		while(keys.hasMoreElements()) {
			System.out.println(keys.nextElement());
		}
		Collection<Integer> values = ht.values();
		Iterator<Integer> it1 = values.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		 Set<Entry<String, Integer>> entrySet = ht.entrySet();
		 Iterator<Entry<String, Integer>> it = entrySet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}

	}

}
/*
 * Type Description Example Fail-fast Throws ConcurrentModificationException if
 * modified during iteration ArrayList, HashMap Fail-safe Works on copy of
 * collection, no exception ConcurrentHashMap, CopyOnWriteArrayList
 */