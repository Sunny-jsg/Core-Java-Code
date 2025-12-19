package in.ramana;

public class Q29 {
	public static void main(String[] args) {

		int[] arr1 = { 2, 0, 5, 3, 1, 0, 3, 1 };
	       length(arr1);

	}
	public static void length(int [] arr) {
		int length =0;
		for(int i=0;i<arr.length;i++) {
			length++;
		}
		System.out.println(length);
	}

}
