package in.linear;

public class Q2 {
	public static void main(String[] args) {
		String s = "sunny";
		char target ='z';
		boolean ans = searchChar(s, target);
		System.out.println(ans);
		
	}
	static boolean searchChar(String s, char target) {
		char[] ch = s.toCharArray();
		if(ch.length ==0) {
			return false;
		}
		for(int i =0;i<ch.length;i++) {
			char c =ch[i];
			if(c == target) {
				return true;
			}
		}
		return false;
	}

}
