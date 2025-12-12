package in.method.jsp;

public class Demo6 {
	public static void main(String[] args) {
		String s1 ="java";
		String s2 ="";
		 
		for(int i =0;i<=s1.length()-1;i++) {
			if(s1.charAt(i) == 'a') {
				s2 +='@';
			}else {
				s2 +=s1.charAt(i);
			}
		}
		System.out.println(s2);
	}

}
