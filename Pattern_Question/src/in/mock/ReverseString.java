package in.mock;

public class ReverseString {
	public static void main(String[] args) {
		String s ="java is oop lang";
		String s2="";
		char[] ch = s.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			s2+=ch[i];
		}
		System.out.println(s2);
	}

}
