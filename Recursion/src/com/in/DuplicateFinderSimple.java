package com.in;

public class DuplicateFinderSimple {
    public static void main(String[] args) {
        findDuplicates("Learn Java Programming");
    }

    static void findDuplicates(String str) {
        str = str.toLowerCase(); // make it case-insensitive
        StringBuilder duplicates = new StringBuilder();

        System.out.println("Duplicate characters in: " + str);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // skip spaces
            if (ch == ' ')
                continue;

            int count = 0;

            // count how many times this character appears
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            // if the character repeats and not already printed
            if (count > 1 && duplicates.indexOf(String.valueOf(ch)) == -1) {
                duplicates.append(ch).append(" ");
                System.out.println(ch + " : " + count);
            }
        }
    }
}
