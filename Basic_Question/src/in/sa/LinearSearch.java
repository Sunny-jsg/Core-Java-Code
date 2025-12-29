package in.sa;

public class LinearSearch {
	public static void main(String[] args) {
		int [] arr = { 32,64,12,99,43,82};
		int key =43;
		int n = linearSearch(arr, 0, key);
		System.out.println(n);
	}
	public static int linearSearch(int [] arr ,int index,int key) {
		if(index == arr.length) {
			return -1;
		}
		if(arr[index] == key) {
			return index;
		}
		return linearSearch(arr, index+1, key);
	}

}
