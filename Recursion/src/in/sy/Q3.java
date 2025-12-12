package in.sy;

public class Q3 {
	public static void main(String[] args) {
		int num =13;
		System.out.println(isPrime(num, num/2));
	}
	public static boolean isPrime(int n,int i) {
		if(i==1)
			return true;
		else if(n%i==0)
			return false;
		else
			return isPrime(n ,--i);
	}

}
