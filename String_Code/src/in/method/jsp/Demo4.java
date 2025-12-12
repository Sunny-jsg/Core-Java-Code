package in.method.jsp;

public class Demo4 {
    public static void main(String[] args) {
        String s1 = "java is an oop lang";
        char[] ch = s1.toCharArray();
        String s2 = "";
        int i = ch.length - 1;
        int j = ch.length - 1;

        while (i >= 0) {

            // Move i left until space
            while (i >= 0 && ch[i] != ' ')
                i--;

            // Extract the word between i+1 to j
            String temp = "";
            for (int k = i + 1; k <= j; k++) {
                temp += ch[k];
            }

            // Add word to result
            s2 += temp;

            // Add space if more words are left
            if (i > 0)
                s2 += " ";

            // Move to previous word
            i--;
            j = i; // ← FIX: j must follow i, not increase
        }

        System.out.println(s2);
    }
}
