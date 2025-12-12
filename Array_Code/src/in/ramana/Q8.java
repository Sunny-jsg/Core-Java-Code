package in.ramana;

public class Q8 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6};
		int evensum=0;
		int oddsum =0;
		for(int i=0;i<arr.length;i++) {
			if(i%2 ==0) {
				evensum +=arr[i];
			}else {
				oddsum+=arr[i];
			}
		}
		System.out.println("Sum of Even Index : " + evensum);
		System.out.println("Sum of Odd Index : " + oddsum);
	}

}
