package in.sa;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 5, 4 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {

        // base case
        if (arr.length <= 1)
            return;

        // divide
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        // copy left array
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        // copy right array
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        // recursive calls
        sort(left);
        sort(right);

        // merge
        merge(left, right, arr);
    }

    public static void merge(int[] a, int[] b, int[] c) {

        int i = 0, j = 0, k = 0;

        // merge both arrays
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        // copy remaining elements of left array
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }

        // copy remaining elements of right array
        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }
    }
}
