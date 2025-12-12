package in.linear;

public class Q1 {
	public static void main(String[] args) {
		int []nums = {12,43,32,94,13,19,13,43,19};
		int target =50;
		int ans = linearSearch(nums, target);
		System.out.println(ans);
		
	}
	static int linearSearch(int [] arr , int target) {
		if(arr.length==0) {
			return -1;
		}
		for(int index =0; index < arr.length;index++) {
			int element =arr[index];
			if(element == target) {
				return index;
			}
		}
		return -1;
	}

}
