package in.sy;

public class Q1 {
	public static void main(String[] args) {
		print(10);
	}

	public static void print(int num) {
		if (num >= 1) {

			print(num - 1);

			System.out.print(num + " ");
		}
	}

}
