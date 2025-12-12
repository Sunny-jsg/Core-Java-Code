package in.loop;
import java.util.Scanner;
public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ::");
		int num = sc.nextInt();
		int temp =num;
		
		int rev =0;
		while(num >0) {
			rev =10*rev+num%10;
			num /=10;
		}
		if(temp ==rev) {
			System.out.println("Palindrome Number ::");
		}else {
			System.out.println("Not Palindrome Number::");
		}
	}

}
