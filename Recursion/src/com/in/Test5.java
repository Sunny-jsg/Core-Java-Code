package com.in;

public class Test5 {
    public static void main(String[] args) {
        String str = "chandana";
        int count = 0;

        System.out.print("Duplicate characters: ");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int freq = 0;

            // Skip if character already checked
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (str.charAt(k) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) continue;

            // Count frequency of current char
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    freq++;
                }
            }

            if (freq > 1) {
                System.out.print(ch + " ");
                count++;
            }
        }

        System.out.println("\nTotal duplicate characters: " + count);
    }
}
