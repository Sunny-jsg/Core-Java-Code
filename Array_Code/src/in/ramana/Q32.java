package in.ramana;

public class Q32 {
	public static void main(String[] args) {
		int [] arr1 = {1,2,3,4};
		int index =2;
		int [] arr2 = new int[arr1.length-1];
		for(int i=0,j=0;i<arr2.length;i++) {
			if(i ==index) {
				arr2[i]=arr1[++j];
			}else {
				arr2[i] =arr1[j++];
			}
		}
		for(int n : arr2) {
			System.out.print(n +" ");
		}
	}

}
