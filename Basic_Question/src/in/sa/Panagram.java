package in.sa;

public class Panagram {
	public static void main(String[] args) {
		String s ="abcdefghijklmnopqrstuvwxyz";
		boolean ans = panagram(s);
		System.out.println(ans);
	}
	public static boolean panagram(String s) {
		s =s.toLowerCase();
		if(s.length()<26) {
			return false;
		}
		for(char c ='a';c <='z';c++) {
			if(!s.contains(c +"")) {
				
				return false;
			}
		}
		return true;
	}

}
