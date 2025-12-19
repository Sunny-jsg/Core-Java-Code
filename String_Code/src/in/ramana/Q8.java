package in.ramana;

public class Q8 {
	public static void main(String[] args) {
		String s = "ash123";
		char key = 's';
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i] == key) {
				System.out.println(i);
			}
		}
	}

}
