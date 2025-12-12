package in.binarySearch;

import java.util.Arrays;
import java.util.Iterator;

public class Q1 {
	public static void main(String[] args) {
		int[] arr1 = { 3,2,6,4,7,9,1,8,5 };
		Arrays.sort(arr1);
          int target =5;
          System.out.println(Arrays.toString(arr1));
          int ans = binarySearch(arr1, target);
          if (ans == -1)
              System.out.println("Element not found");
          else
              System.out.println("Element found at index: " + ans);
	}
	
	public static int binarySearch(int [] arr , int target) {
		int start =0;
		int end =arr.length-1;
		while(start <=end) {
			int mid = start + (end -start)/2;
			if(target <arr[mid]) {
				end =mid -1;
			}else if(target >arr[mid]) {
				start =mid+1;
			}else {
				return mid;
			}
			
		}
		return -1;
	}

}
