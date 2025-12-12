package in.sy;

public class Q5 {
	public static void main(String[] args) {
		int num = 9;
		int sqre = num * num;
		int ans = neonNumber(sqre);
		if (num == ans) {
			System.out.println(ans + " neon Number");
		} else {
			System.out.println(ans + " not neon Number");
		}
	}

	public static int neonNumber(int num) {
		if (num == 0)
			return 0;
		return (num % 10) + neonNumber(num / 10);
	}

}
