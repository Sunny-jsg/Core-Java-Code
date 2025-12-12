package in.ramana;

public class Q24 {
	public static void main(String[] args) {
		int [] arr = {23,55,57,93,1};
		for(int i =0;i<=arr.length-1;i++) {
			int rev =0;
			int num =arr[i];
			while(num >0) {
				int d =num%10;
				rev = rev*10 +d;
				num/=10;
			}
			System.out.print(rev +" ");
		}
	}

}
