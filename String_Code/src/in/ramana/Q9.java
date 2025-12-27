package in.ramana;

public class Q9 {
	public static void main(String[] args) {
		String s = "AssmnAN";

		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			boolean alreadyCounted = false;

			// check if already counted
			for (int k = 0; k < i; k++) {
				if (ch[i] == ch[k]) {
					alreadyCounted = true;
					break;
				}
			}

			if (alreadyCounted)
				continue;
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j])
					count++;
			}
			System.out.println(ch[i] + " = " + count);
		}

		/*
		 * String s2 =""; while(s.length()>0) { char ch = s.charAt(0); s2 =
		 * s.replace(ch+"" , ""); int count =s.length()-s2.length();
		 * System.out.println(ch + " = " + count);
		 */

		// s=s2;
	}
}
