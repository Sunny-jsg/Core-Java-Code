package in.ramana;

public class Q45 {
	public static void main(String[] args) {
		String s ="abdef";
	
		for(char c = 'a';c<='z';c++) {
			if(s.indexOf(c) ==-1) {
				 System.out.println("Missing alphabet: " + c);
	                break;
			}
		}
	}

}
