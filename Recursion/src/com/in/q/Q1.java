package com.in.q;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        if (isAutomorphic(num))
	            System.out.println(num + " is an Automorphic number.");
	        else
	            System.out.println(num + " is not an Automorphic number.");
		
	}
       
	  
	public static boolean isAutomorphic(int n) {
		int squre = n*n;
		while(n>0) {
			if(n%10 !=squre%10)
				return false;
			n/=10;
			squre/=10;
		}
      return true;
	}
}