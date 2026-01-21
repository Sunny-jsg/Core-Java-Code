package in.dsa;

import java.util.Arrays;

public class UnionArray {
	public static void main(String[] args) {
		int[] n1 = { 1, 2, 3 };
		int[] n2 = { 2, 3, 4 };
		int[] union = unionArray1(n1, n2);
		System.out.println(Arrays.toString(union));
	}

	public static int[] unionArray1(int[] nums1, int[] nums2) {

		int[] temp = new int[nums1.length + nums2.length];
		int k = 0;

		// add nums1
		for (int x : nums1) {
			temp[k++] = x;
		}

		// add nums2
		for (int x : nums2) {
			temp[k++] = x;
		}

		// remove duplicates
		int[] unique = new int[temp.length];
		int size = 0;

		for (int i = 0; i < temp.length; i++) {
			boolean found = false;
			for (int j = 0; j < size; j++) {
				if (temp[i] == unique[j]) {
					found = true;
					break;
				}
			}
			if (!found) {
				unique[size++] = temp[i];
			}
		}

		// sort
		Arrays.sort(unique, 0, size);

		// exact size array
		return Arrays.copyOf(unique, size);
	}
}
