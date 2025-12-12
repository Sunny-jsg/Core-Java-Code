package in.ramana;

public class Q13 {
	public static void main(String[] args) {
		int[] arr = {1,2,9,3,9,4,9,6,7,8};
        int target = 9;
        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                lastIndex = i;  // updates every time match found
            }
        }

        System.out.println("Last index of " + target + " is: " + lastIndex);
    

	}

}
