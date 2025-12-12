package com.in;

public class PrimeNum {
	public static void main(String[] args) {
		
		
		
		for(int i=1;i<=50;i++) {
			boolean isPrime =true;
			if(i <=2) {
				continue;
			}
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				
				System.out.println(i );
				
				
			}
		}
	}

}
