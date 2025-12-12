package in.sy;

public class Q2 {
	public static void main(String[] args) {
		System.out.println(fact(4));
	}

	static int fact(int a) {
		if (a== 1)
			return 1;
		else
			return a * fact(a-1);
	}

}
