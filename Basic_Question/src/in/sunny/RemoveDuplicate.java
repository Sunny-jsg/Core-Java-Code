package in.sunny;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 3, 2, 1, 6, 7, 4, 8 };
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		for (int s : arr) {
			lhs.add(s);
		}

		Iterator<Integer> it = lhs.iterator();
		while (it.hasNext()) {
			Integer num = it.next();
			System.out.print(num + " ");
		}
	}

}
