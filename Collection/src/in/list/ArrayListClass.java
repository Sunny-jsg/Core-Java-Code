package in.list;

import java.util.ArrayList;

public class ArrayListClass {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(10);
		al.add(10);//duplicate value are allowed.
		al.add(null); //null value also allowed
		al.add(true);
		al.add("Sunny");
		System.out.println(al);
	}

}
