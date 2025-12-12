package in.jspider;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		int size = sc.nextInt();
		int [] arr = new int [size];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter Value");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] );
		}
	
		
		
	}

}
