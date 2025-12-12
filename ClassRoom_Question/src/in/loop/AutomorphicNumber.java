package in.loop;
import java.util.Scanner;
public class AutomorphicNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number ::");
		int num = sc.nextInt();
		int square = num* num;
		Boolean flag =true;
		int temp =num;
		while(temp>0) {
			
			if(temp%10 != square%10) {
				flag=false;
				break;
			}
			square/=10;
			temp /=10;
			
		}
		 if (flag) {
	            System.out.println(num + " is an Automorphic Number.");
	        } else {
	            System.out.println(num + " is NOT an Automorphic Number.");
	        }
	}

}
