package in.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(null);
		al.add("Hello");
		al.add(true);
		al.add('s');
		
		  Iterator it = al.iterator(); while(it.hasNext()) { Object s = it.next();
		  System.out.println(s); }
		 
		System.out.println(al);
		
	}

}
