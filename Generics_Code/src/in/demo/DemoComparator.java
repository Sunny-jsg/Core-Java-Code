package in.demo;

import java.util.Comparator;

public class DemoComparator implements Comparator<Student> {

	/*
	 * @Override public int compare(Student o1, Student o2) { return
	 * o1.marks.compareTo(o2.marks); }
	 */
	@Override
	public int compare(Student o1, Student o2) {
		return o1.sname.compareTo(o2.sname);
	}

}
