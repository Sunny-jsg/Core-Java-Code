package in.ramana;

public class Q30 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 3, 2 };
          duplicate(arr);
	}

	public static void duplicate(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			if (count >= 1) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
