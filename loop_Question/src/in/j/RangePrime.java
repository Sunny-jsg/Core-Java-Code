package in.j;

import java.util.Scanner;

public class RangePrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start Range ::");
		int a = sc.nextInt();
		System.out.println("Enter End Range ::");
		int b = sc.nextInt();
		  System.out.println("Prime numbers between " + a + " and " + b + " are:");
	        for (int i = a; i <= b; i++) {
	            if (rPrime(i)) {
	                System.out.print(i + " ");
	                
	            }
	        }
		
	}
     public static boolean rPrime(int i) {
    	      if(i <=1)
    	    	  return false;
    	      
    	      for(int  j=2; j <=Math.sqrt(i);j++) {
    	    	     if(i%j==0)
    	    	    	 return false;
    	      }
    	      return true;
     }
}
