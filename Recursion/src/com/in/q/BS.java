package com.in.q;

public class BS {
	public static void main(String[] args) {
		int [] a = {3,5,7,9,11,22,43,56};
		int s =0;
		int e =a.length-1;
		int target=3;
		int ans = search(a, target, s, e);
		System.out.println(ans);
		
	}
	public static int search(int []a, int target, int s, int e) {
		if(s>e) {
			return -1;
		}
		int m = s+ (e-s)/2;
		if(target == a[m]) {
			return m;
		}
		if(target <a[m]) {
			return search(a, target, s, m-1);
		}
		return search(a, target, m+1, e);
	}

}
