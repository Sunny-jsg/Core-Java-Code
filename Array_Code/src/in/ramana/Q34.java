package in.ramana;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Q34 {
	public static void main(String[] args) {
		int [] arr1 = {1,2,4,5,6};
		int [] arr2 = {2,5,8,9,3,1};
		LinkedHashSet<Integer> lhs1 = new LinkedHashSet<>();
		LinkedHashSet<Integer> lhs2 = new LinkedHashSet<>();
		for(int n : arr1) {
			lhs1.add(n);
		}
		for(int n1 : arr2) {
			lhs2.add(n1);
		}
		LinkedHashSet<Integer> common = new LinkedHashSet<>(lhs1);
		common.retainAll(lhs2);
		
	
		System.out.println(common);
	}

}
