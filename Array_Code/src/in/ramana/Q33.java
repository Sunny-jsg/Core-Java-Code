package in.ramana;

import java.util.HashSet;
import java.util.Set;

public class Q33 {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 5, 8, 9, 3, 1};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // add elements of arr1
        for (int n : arr1) {
            set1.add(n);
        }

        // add elements of arr2
        for (int n : arr2) {
            set2.add(n);
        }

        // store common elements
        Set<Integer> common = new HashSet<>(set1);
        common.retainAll(set2);

        // remove common elements
        set1.removeAll(common);
        set2.removeAll(common);

        // print distinct elements
        set1.addAll(set2);
        System.out.println(set1);
	}

}
