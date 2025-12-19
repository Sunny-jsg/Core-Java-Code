package in.ramana;

import java.util.ArrayList;

public class Q31 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4};
		int element =5;
		int index =3;
		
		int [] newArr = new int[arr.length+1];
		for(int i=0 ,j=0;i<newArr.length;i++) {
			if(i == index) {
				newArr[i] = element;
			}else {
				newArr[i] =arr[j++];
			}
		}
		for(int n : newArr) {
			System.out.print(n +" ");
		}
	}

}
