package in.sy;

public class Perfect {
	public static void main(String[] args) {
		int num =6;
		int ans = perfect(num, 5);
		if(ans ==num) {
			System.out.println(ans + " is PerfectNo");
		}
	}
   static int perfect(int n,int i) {
	   if(i==0)return 0;
	   if(n%i ==0)
		   return i+perfect(n, i-1);
	   return perfect(n, i-1);
   }
}
