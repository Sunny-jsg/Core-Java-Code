package in.mock;

public class ArmStrongNumber {
	public static void main(String[] args) {
		int num =153;
		if(armStrong(num)) {
			System.out.println(num + " it is a ArmStrong Number:");
		}
		
	}
  public static boolean armStrong(int n) {
	  int temp =n;
	  int sum =0;
	  int count =0;
	  while(temp > 0) {
		  int d = temp%10;
		  count++;
		  temp/=10;
		  
	  }
	  temp =n;
	  while(temp >0) {
		  int f = temp %10;
		  sum += Math.pow(f, count);
		  temp/=10;
	  }
	  if(n != sum) {
		  return false;
	  }
	  return true;
  }
}
