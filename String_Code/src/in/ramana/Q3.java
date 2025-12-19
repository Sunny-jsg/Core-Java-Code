package in.ramana;

public class Q3 {
    public static void main(String[] args) {

        String s = "ram#123"; // output : 123#ram
        char[] ch = s.toCharArray();

        // 1️⃣ Print digits
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= '0' && ch[i] <= '9') {
                System.out.print(ch[i]);
            }
        }

        // 2️⃣ Print special character #
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '#') {
                System.out.print(ch[i]);
            }
        }

        // 3️⃣ Print alphabets
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                System.out.print(ch[i]);
            }
        }
    }
}
