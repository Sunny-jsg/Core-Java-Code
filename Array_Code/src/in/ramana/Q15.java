package in.ramana;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Q15 {
	public static void main(String[] args) {
		int [] arr = {1,1,1,2,2,1};
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		 // Count frequency
        for (int n : arr) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }

        // Step 1: Find minimum frequency
        int min = Integer.MAX_VALUE;
        for (int value : hm.values()) {
            if (value < min) {
                min = value;
            }
        }

        // Step 2: Print all elements having minimum frequency
        System.out.println("Minimum Frequency: " + min);
        System.out.print("Elements: ");

        for (Entry<Integer, Integer> e : hm.entrySet()) {
            if (e.getValue() == min) {
                System.out.print(e.getKey() + " ");
            }
        }
	}

}
