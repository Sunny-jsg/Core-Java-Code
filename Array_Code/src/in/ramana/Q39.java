package in.ramana;

import java.util.Arrays;

public class Q39 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 1, 3, 2 };
		int index = 3;
		

        int[] result = new int[arr.length - index ];
        int j = 0;

        for (int i = index ; i < arr.length; i++) {
            result[j] = arr[i];
            j++;
        }

        System.out.println(Arrays.toString(result));

	}

}
