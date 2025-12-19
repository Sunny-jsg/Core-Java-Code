package in.ramana;

import java.util.Arrays;

public class Q38 {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};

	        for (int i = arr.length - 1; i > 0; i--) {
	            int j = (int) (Math.random() * (i + 1));

	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }

	        System.out.println(Arrays.toString(arr));
	    }
	


}
