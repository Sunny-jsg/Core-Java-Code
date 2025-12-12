package in.basic;

import java.util.Scanner;

public class OddSum {
	public static void main(String[] args) {
		int sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ::");
		int n = sc.nextInt();
		for(int i =1; i<=n;i++) {
			if(i%2 !=0) 
				sum+=i;
			
		}
		System.out.println(sum);
	}

}
