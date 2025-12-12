package in.linear;

public class MaxWealth {
	public static void main(String[] args) {
		int[][] wealth = { { 5, 3 }, { 3, 2 }, { 6, 4 } };
		int max = maxWealth(wealth);
		System.out.println(max);
		
	}
	public static int maxWealth(int [][] account) {
		/*
		 * int maxValue =0; for(int i =0;i<account.length;i++) { int sum =0; for(int j
		 * =0;j<account[i].length;j++) { sum +=account[i][j]; } if(sum > maxValue) {
		 * maxValue=sum; } } return maxValue;
		 */
		int ans = Integer.MIN_VALUE;
		for (int[] ints : account) {
			int sum =0;
			for (int anints : ints) {
				sum+=anints;
			}
			if(sum>ans) {
				ans=sum;
			}
			
		}
		return ans;
	}
	
	

}
