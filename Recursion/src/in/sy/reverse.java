package in.sy;

public class reverse {
	public static void main(String[] args) {
		String s1 ="4321";
		System.out.println(reverse(Integer.parseInt(s1),s1.length()));
	}
	public static int reverse(int num,int length) {
		if(length ==0) 
			return 0;
		else 
			return ((num%10)*(int)Math.pow(10, length-1))+
					reverse(num/10,--length);
		
		
	}

}
