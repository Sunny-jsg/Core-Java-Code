package in.sy;

public class neon {
	public static void main(String[] args) {
		int num = 6;
		String s = String.valueOf(num);
		int pow = s.length();
		System.out.println(perfect(num,num-1));
	}

	public static int perfect(int num,int n) {
		if(n==0)
			return 0;
		if(num % n ==0)
			return n +perfect(num,n-1);
		
		return perfect(num,n-1);
		

	}
	
}