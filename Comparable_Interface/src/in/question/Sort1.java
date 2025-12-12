package in.question;

public class Sort1 {

	public static void sort(Object[] o) {

		for (int i = 0; i < o.length; i++) {
			for (int j = 0; j < o.length - 1 - i; j++) {
				Comparable c = (Comparable) o[j];
				if (c.compareTo(o[j + 1]) > 0) {
					Object temp = o[j + 1];
					o[j + 1] = o[j];
					o[j] = temp;

				}
			}
		}

	}

}
