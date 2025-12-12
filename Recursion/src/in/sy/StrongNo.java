package in.sy;

public class StrongNo {
	public static void main(String[] args) {
		int num =145;
		int ans = Strong(num);
		if(ans == num) {
			System.out.println(ans +" StrongNo:");
		}else {
			System.out.println("no");
		}
	}
	static int fact(int num) {
		if(num<=1) return 1;
		return num*fact(num-1);
	}
	public static int Strong(int num) {
		int sum =0;
		int temp=num;
		while(num >0) {
			int d =num%10;
			sum=sum+fact(d);
			num/=10;
		}
		
		return sum;
	}
	
	
	

}
