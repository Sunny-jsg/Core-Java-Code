package in.sy;

public class Palindrome {
	public static void main(String[] args) {
		String s1 ="madam";
		String s2 ="";
		char[] ch = s1.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			s2 +=ch[i];
		}
		if(s1.equals(s2)) {
			System.out.println("it is a palindrome String");
		}else {
			
			System.out.println("not");
		}
	}

}
