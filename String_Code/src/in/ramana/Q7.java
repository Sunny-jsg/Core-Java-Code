package in.ramana;

public class Q7 {
	public static void main(String[] args) {
		String s ="ash123";
		int sum =0;
		char[] ch = s.toCharArray();
		for(int i=0; i<ch.length;i++) {
			if(ch[i] >='1' && ch[i]<='9') {
				sum =sum + (ch[i] -'0');
			}
		}
		System.out.println(sum);
	}

}
