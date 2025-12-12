package in.question;

public class Q3 {
	public static void main(String[] args) {
		int [] arr = {1,3,2,4,2,1,3,6,5,5,4};
		int ans = ans(arr);
		System.out.println(ans);
		
	}
	public static int ans(int[] arr) {
		int unique =0;
		for(int n : arr) {
			unique ^=n;
		}
		return unique;
	}

}
