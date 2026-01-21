package in.dsa;

import java.util.Arrays;

public class MoveZero {
	public static void main(String[] args) {
		int[] nums = { 0, 1, 4, 0, 5, 2 };
		moveZeroes(nums);
	}

	public static void moveZeroes(int[] nums) {
		  int index = 0;

	        // Move non-zero elements to front
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] != 0) {
	                nums[index++] = nums[i];
	            }
	        }

	        // Fill remaining positions with zero
	        while (index < nums.length) {
	            nums[index++] = 0;
	        }

	}

}
