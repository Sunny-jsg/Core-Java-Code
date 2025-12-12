package in.sy;

public class Q4 {
	public static void main(String[] args) {
		int num =153;
		int count =digits(num);
		int ans = isArmStrong(num, count );
		if(num == ans) {
			System.out.println(ans + " is ArmStrong Number");
		}else {
			System.out.println(ans + " not ArmStrong Number");
		}
	}
	public static  int  digits(int num) {
		if(num ==0)
			return 0;
		return 1+digits(num/10);
	}
	public static int isArmStrong(int num ,int digits) {
		if(num==0)
			return 0;
		int d = num%10;
		return (int)Math.pow(d, digits)+isArmStrong(num/10, digits);
	}

}
