package in.mock;

public class NeonNumber {
	public static void main(String[] args) {
		int num=9;
		if(neonNumber(num)) {
			System.out.println("Neon Number");
		}else {
			System.out.println("Not neon Number");
		}

	}

	public static boolean neonNumber(int num) {
	  int sum =0;
	  int squre = num* num;
	  while(squre >0) {
		  int d = squre%10;
		  sum+=d;
		  squre/=10;
	  }
	  return sum ==num;
	  
	  
  }

}
