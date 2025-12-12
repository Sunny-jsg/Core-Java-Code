package map_concept.in;

import java.util.*;

import java.util.*;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<String, Integer> sm = new TreeMap<>();
        sm.put("Charlie", 85);
        sm.put("Alice", 92);
        sm.put("Bob", 78);
        sm.put("David", 95);

        System.out.println("--- 1. Map in Natural Key Order ---" + sm);
        System.out.println(sm.firstKey());
        System.out.println(sm.lastKey());
        System.out.println(sm.headMap("Charlie"));
        System.out.println(sm.tailMap("Bob"));
        System.out.println(sm.subMap("Bob", "David"));

        SortedMap<String, Integer> reverseMap = new TreeMap<>(Comparator.reverseOrder());
        reverseMap.put("Apple", 10);
        reverseMap.put("Banana", 20);
        reverseMap.put("Cherry", 30);

        System.out.println(reverseMap);
        System.out.println("Comparator used : " + (reverseMap.comparator() != null ? "Custom Comparator" : "Null (Natural Order)"));
    }
}
