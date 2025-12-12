package in.loop;

import java.util.Scanner;

public class BinaryToDecimal {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Binary Number::");
		String binary = sc.nextLine();
		int l = binary.length();
		int manualDecimal=0;
		int power=0;
		for(int i=l-1;i>=0;i--) {
			char bit = binary.charAt(i);
			if(bit=='1') {
				manualDecimal +=Math.pow(2, power);
			}
			power++;
			
		}
		System.out.println("Decimal (manual): " + manualDecimal);
	}

}
