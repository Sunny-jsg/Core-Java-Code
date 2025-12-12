package in.question;

/*2. Find the smallest element in an array

Input: {5, 2, 7, 1, 9}
Output: 1*/
public class Question_2 {
	public static void main(String[] args) {
		int [] arr = {5,2,7,1,9};
		int min =arr[0];
		for(int i =1;i<arr.length;i++) {
			if( arr[0]>arr[i]) {
				min=arr[i];
				
			}
		}
		System.out.println(min);
	}

}
