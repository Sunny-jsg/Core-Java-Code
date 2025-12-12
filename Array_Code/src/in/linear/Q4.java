package in.linear;

public class Q4 {
	public static void main(String[] args) {
		int[] nums = { 12, 345, 2, 6, 7896, 98 };
		System.out.println(findNumbers(nums));

	}

	public static int findNumbers(int[] nums) {
		
		int totalEvenValue = 0;
		
		for (int i = 0; i < nums.length; i++) {
			int digit = nums[i];
			int count = 0;
			while (digit > 0) {
				
				count++;
				digit /= 10;
			}
				if (count % 2 == 0) {
					totalEvenValue++;
				}
			
		}
		return totalEvenValue;
	}
}
