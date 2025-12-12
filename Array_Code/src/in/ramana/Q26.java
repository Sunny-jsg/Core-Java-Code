package in.ramana;

public class Q26 {
	public static void main(String[] args) {
		int [] arr = {231,554,572,962,24,1};
		
		for(int s : arr) {
			int num =s;
			int sum =0;
			while(num >0) {
				int d = num%10;
				if(d %2 ==0) {
					sum +=d;
				}
				num/=10;
			}
			System.out.print(sum +" ");
		}
	}

}
