package in.test;

public class E {
	public static void main(String[] args) {
		boolean [] values = {true, false,true};
		invert(values);
	}
    
	static void invert(boolean [] arr) {
		int n= arr.length;
		for(int i=0;i<n;i++) {
			arr[i] = !arr[i];
		}
	}
}
