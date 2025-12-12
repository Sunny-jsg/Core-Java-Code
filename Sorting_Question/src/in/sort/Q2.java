package in.sort;

public class Q2 {
	public static void main(String[] args) {
		int [] arr = { 4,2,98,43,21,84,32,56,65};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j] >arr[j+1]) {
					int temp =arr[j+1];
					arr[j+1] =arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int s: arr) {
			System.out.print(s + " ");
		}
	}

}
