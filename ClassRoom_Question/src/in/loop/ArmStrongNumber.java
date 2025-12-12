package in.loop;

public class ArmStrongNumber {
	public static void main(String[] args) {
		int n = 9474, sum = 0, temp = n;
		int digits = String.valueOf(n).length(); // count digits

		while (n > 0) {
		    int d = n % 10;
		    sum += Math.pow(d, digits);  // raise to power of digits
		    n /= 10;
		}

		if (sum == temp)
		    System.out.println("Armstrong");
		else
		    System.out.println("Not Armstrong");

	}

}
