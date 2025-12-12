package in.basic;

public class CubeOfEachNumber {
	public static void main(String[] args) {
		int num =123;
		int cube =0;
		
		while(num >0) {
			int d =num%10;
			cube = d*d*d;
			System.out.println(cube);
			cube =0;
			num/=10;
		}
	}

}
