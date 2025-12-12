package in.method.jsp;

public class ReverseString {
	public static void main(String[] args) {
		String s = "java";
		char[] ch = s.toCharArray();
		int i =0;
		int j = ch.length-1;
		while(i <j) {
			char temp = ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
			
		}
		String s1 = new String(ch);
		System.out.print(s1 +" ");
	}

}
