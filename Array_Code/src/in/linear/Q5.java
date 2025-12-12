package in.linear;

public class Q5 {
	public static void main(String[] args) {
		int [] arr = {12,22,32,42,52,62,72,82,92};
		int target =62;
		int ans = isLinear(arr, target);
		System.out.println(ans);
	}
	
	public static int isLinear(int [] arr ,int target) {
		if(arr.length==0) {
			return -1;
			
		}
		for(int i =0;i<arr.length;i++) {
			int temp = arr[i];
			if(temp == target) {
				return i;
			}
		}
		return -1;
	}

}
