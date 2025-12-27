package in.ramana;

public class Q24 {
	  
	public static void main(String[] args) {
		String s ="3124";
		
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int x =ch[i]-'0';
			System.out.print(x);
		}
		
	}

}
