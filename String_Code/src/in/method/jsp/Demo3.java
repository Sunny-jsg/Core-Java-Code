package in.method.jsp;

public class Demo3 {
	public static void main(String[] args) {
		String s1 = "Java is An Oop ";
		String[] s2 = s1.split(" ");
		String s3 ="";
		for(int i=s2.length-1;i>=0;i--) {
			s3+=s2[i];
			if(i>0)
				s3+=" ";
		}
		System.out.println(s3);
	}

}
