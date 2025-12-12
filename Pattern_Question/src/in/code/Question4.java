package in.code;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n = sc.nextInt();
		int count =0;
		int temp=n;
		int sum=0;
		while(n>0) {
			int d =n%10;
			count++;
			n/=10;
		}
		n=temp;
		while(n>0) {
	     int f =n%10;
	     sum+=Math.pow(f, count);
	       n/=10;
	     
		}
	    if(temp == sum) {
		System.out.println(sum +" is an Armstrong number ");
	    }
	    else {
	    	System.out.println(sum +" is not an ArmStrong number ");
	    }
	}

}
