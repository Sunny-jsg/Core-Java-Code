package in.ramana;

public class Q41 {
	public static void main(String[] args) {
		int [] arr = {2,4,3,1,6,9,7,8};
		int target =2;
		int ans = linearSearch(arr, target);
		System.out.println(ans);
	}
	
	public static int linearSearch(int [] arr , int target) {
		if(arr.length ==0)
			return -1;
		for(int i =0; i<arr.length;i++) {
			int element = arr[i];
			if(target == element) {
				return i;
			}
		}
		return -1;
	}

}
