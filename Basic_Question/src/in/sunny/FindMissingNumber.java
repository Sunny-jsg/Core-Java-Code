package in.sunny;

public class FindMissingNumber {
	public static void main(String[] args) {
      int[] arr = { 4, 5, 3, 2, 6, 1, 8, 9 };
      int n =9;
      int totalSum = n*(n+1)/2;
      int arrSum =0;
      for(int num : arr) {
    	  arrSum +=num;
      }
      System.out.println("Missing Number : " + (totalSum -arrSum));
	}

}
