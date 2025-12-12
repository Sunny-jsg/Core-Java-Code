package in.ramana;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Q12 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,2,1,4};
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int s : arr) {
			hm.put(s, hm.getOrDefault(s, 0)+1);
		}
		Set<Entry<Integer, Integer>> es = hm.entrySet();
		Iterator<Entry<Integer, Integer>> it = es.iterator();
		while( it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
