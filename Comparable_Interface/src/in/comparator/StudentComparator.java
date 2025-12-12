package in.comparator;

import java.util.Comparator;

public class StudentComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		/*
		 * int nameCompare = s1.name.compareTo(s2.name); if (nameCompare == 0) { return
		 * Double.compare(s1.marks, s2.marks); } return nameCompare;
		 */
		// 1. Compare by name
		int nameCompare = s1.name.compareTo(s2.name);
		if (nameCompare != 0)
			return nameCompare;

		// 2. If name same → compare by marks
		int marksCompare = Double.compare(s1.marks, s2.marks);
		if (marksCompare != 0)
			return marksCompare;

		// 3. If marks also same → compare by branch
		return s1.branch.compareTo(s2.branch);
	}

}
