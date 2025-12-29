package in.sa;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 5, 4 };
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int start, int end) {

        if (start >= end)          // 1️⃣ Base case
            return;

        int i = start, j = end;    // 2️⃣ Two pointers

        int pivot = arr[(start + end) / 2]; // 3️⃣ Choose pivot (middle element)

        while (i <= j) {           // 4️⃣ Partition loop

            while (arr[i] < pivot) // 5️⃣ Move i right
                i++;

            while (arr[j] > pivot) // 6️⃣ Move j left
                j--;

            if (i <= j) {          // 7️⃣ Swap misplaced elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        sort(arr, start, j);       // 8️⃣ Sort left part
        sort(arr, i, end);         // 9️⃣ Sort right part
    }
}
