package in.number;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start Number ::");
		int a = sc.nextInt();
		System.out.println("Enter End Number ::");
		int b = sc.nextInt();
		for(int i=a;i<=b;i++) {
			if(isStrongNumber(i)) {
				System.out.println(i + " is Strong Number");
			}
		}
		
	}
   public static boolean isStrongNumber(int n) {
	   int sum =0;
	   int temp =n;
	   while(n >0) {
		   int d = n%10;
		   int fact =1;
		   for(int j =1; j<=d;j++) {
			   fact *=j;
		   }
		   sum+=fact;
		   n/=10;
	   }
	   return sum ==temp;
   }
}
