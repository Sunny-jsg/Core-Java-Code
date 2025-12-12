package com.in.obj;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Using Arrays.toString():");
        System.out.println(Arrays.toString(arr));

        System.out.println("\nUsing Arrays.deepToString():");
        System.out.println(Arrays.deepToString(arr));
    }
}

