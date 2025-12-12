package in.loop;

public class GetEachNumber {
	public static void main(String[] args) {
		int n =8473721;
		for(;n>0;n/=10) {
			int d =n%10;
			System.out.print(d +" ");
			
		}
	}

}
