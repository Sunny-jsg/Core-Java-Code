package in.ramana;

public class ShiftZeroRightSide {
	public static void main(String[] args) {
		int [] arr1  = {2,0,5,3,1,0,3,1};
		int [] arr2 = new int[arr1.length];
		int index =0;
		for(int i =0;i<arr1.length;i++) {
			if(arr1[i]!=0) {
				arr2[index++] =arr1[i];
			}
		}
		for(int n: arr2) {
			System.out.print(n + " ");
		}
	}

}
