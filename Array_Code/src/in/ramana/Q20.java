package in.ramana;

public class Q20 {
	public static void main(String[] args) {
		int [] arr = {0,2,-1,0,2,-1,3};
		for(int i =0;i<=arr.length-1;i++) {
			if(arr[i]==0) {
				arr[i]=-1;
			}else if(arr[i] == -1) {
				arr[i] =0;
			}
			System.out.print(arr[i] + " ");
		}
		
	}

}
