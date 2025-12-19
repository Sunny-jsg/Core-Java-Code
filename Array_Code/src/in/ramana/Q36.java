package in.ramana;

import java.util.ArrayList;
import java.util.List;

public class Q36 {
	public static void main(String[] args) {
		int [] arr1 = {2,4,6,8,13};
		List<Integer> l = new ArrayList<>();
		
		for(int i =0;i<arr1.length-1;i++) {
			for(int j =arr1[i]+1; j< arr1[i +1];j++) {
				l.add(j);
			}
		}
		System.out.println(l);
	}

}
