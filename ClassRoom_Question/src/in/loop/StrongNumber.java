package in.loop;
import java.util.Scanner;
public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ::");
		int num = sc.nextInt();
		int sum=0;
		int temp=num;
		for(;num>0;num/=10) {
			int d=num%10;
			int fac =1;
			for(int i=1;i<=d;i++) {
				fac *= i;
			}
			sum +=fac;
			
		}
		if(temp ==sum) {
			System.out.println("Strong Number ");
		}else {
			System.out.println("Not Strong Number");
		}
	}

}
