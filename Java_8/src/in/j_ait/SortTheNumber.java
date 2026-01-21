package in.j_ait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTheNumber {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(43);
		l.add(32);
		l.add(64);
		l.add(12);
		l.add(55);
		l.add(5);
		System.out.println("Before Sort :: " + l);
				
		  Collections.sort(l, (i,j) -> (i > j)? -1:1); Collections.sort(l, (i,j) ->
		  i.compareTo(j)); System.out.println("After Sort  :: " + l);
		 
	}

}

/*
 * class Number implements Comparator<Integer> {
 * 
 * @Override public int compare(Integer i, Integer j) { if (i > j) { return -1;
 * 
 * } else if (i < j) { return 1; } return 0; } }
 * 
 * 
 */