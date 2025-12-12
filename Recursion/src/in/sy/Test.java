package in.sy;

public class Test {
    public static void main(String[] args) {
        int num = 1;

        for (int i = 1; i <= 5; i++) {

            if (i == 2 || i == 4) {   // Reverse rows
                int start = num;
                int end = num + i - 1;

                for (int k = end; k >= start; k--) {
                    System.out.print(k + " ");
                }

                num = end + 1;   // update num
            }
            else {                // Normal rows
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num++;
                }
            }

            System.out.println();
        }
    }
}
