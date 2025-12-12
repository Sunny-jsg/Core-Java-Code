package in.loop;
import java.util.Scanner;
public class DecimalToBinary {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a decimal number: ");
	        int decimal = sc.nextInt();

	        // StringBuilder to store binary digits
	        StringBuilder binary = new StringBuilder();

	        int num = decimal;
	        while(num > 0) {
	            int remainder = num % 2;   // get last binary digit
	            binary.append(remainder);  // append to string
	                num=num/2;       // divide number by 2
	        }

	        // reverse the string because we built it backwards
	        binary.reverse();

	        System.out.println("Binary Number: " + binary.toString());
	    }
	}


