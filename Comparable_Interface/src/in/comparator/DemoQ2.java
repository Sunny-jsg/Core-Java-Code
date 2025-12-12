package in.comparator;

import java.util.Comparator;

public class DemoQ2 implements Comparator{
	public int compare(Object o1,Object o2) {
		String s1 = (String)o1;
		String s2 = (String)o2;
		
		return s1.compareToIgnoreCase(s2);
		}
}