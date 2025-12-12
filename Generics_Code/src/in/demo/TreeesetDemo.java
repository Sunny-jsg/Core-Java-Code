package in.demo;

import java.util.Collections;
import java.util.TreeSet;

public class TreeesetDemo {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>(new TreeDemo());
		ts.add("mohan");
		ts.add("sita");
		ts.add("radha");
		ts.add("gita");
		ts.add("ram");

		System.out.println(ts);
	}

}
