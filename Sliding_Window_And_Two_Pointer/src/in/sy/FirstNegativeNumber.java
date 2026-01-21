package in.sy;

public class FirstNegativeNumber {
	public static void main(String[] args) {
		int [] arr = {12, -1, -7, 8, -15, 30, 16, 28};
		int key =3;
	}
	public static void negativeNumber(int[] arr, int k) {
		int l=0;
		int [] arr1 = new int[k];
		for(int r=0;r<arr.length;r++) {
			arr1[r] = arr[r];
			if(r-l+1 ==k) {
				for(int i =0;i<arr1.length;i++) {
					if(i < 0) {
						System.out.print(arr1[i] + " ");
						break;
					}
					
				}
				
			}
		}
	}
	

}
