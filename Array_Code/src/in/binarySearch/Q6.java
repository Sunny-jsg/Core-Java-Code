package in.binarySearch;

public class Q6 {
	public static void main(String[] args) {
		int [] arr = {12,22,32,42,52,62,72,82,92};
		int target =62;
		int ans = isBinarySearch(arr, target);
		System.out.println(ans);
		
	}
	public static int isBinarySearch(int[] num ,int target) {
		int start =0;
		int end = num .length-1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(target > num[mid]) {
				start = mid +1;
			}else if (target < num[mid]){
				end = mid -1;
			}else {
				return mid;
			}
		}
		return -1;
	}

}
