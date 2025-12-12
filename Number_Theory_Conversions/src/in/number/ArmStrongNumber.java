package in.number;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start Number ::");
		int a = sc.nextInt();
		System.out.println("Enter End Number ::");
		int b = sc.nextInt();
		for(int i=a;i<=b;i++) {
			if(armStrong(i)) {
				System.out.println(i + " is ArmStrong Number");
			}
		}
		
	}
    public static boolean armStrong(int n) {
    	int temp = n;
    	int count =0;
    	int sum=0;
    	while(temp > 0) {
    		int d = temp %10;
    		count ++;
    		temp/=10;
    	}
    	temp =n;
    	while(temp > 0) {
    		int f = temp %10;
    		sum += Math.pow(f, count);
    		temp/=10;
    	}
    	return sum == n;
    }
}
