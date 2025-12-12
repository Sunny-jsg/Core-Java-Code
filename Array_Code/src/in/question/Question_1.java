package in.question;

/*1. Find the largest element in an array

Input: {10, 20, 5, 40, 30}
Output: 40*/
public class Question_1 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[0]<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
