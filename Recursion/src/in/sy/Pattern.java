package in.sy;

public class Pattern {
    public static void main(String[] args) {
        int num = 1;

        for (int i = 1; i <= 5; i++) {

            if (i == 2 || i == 4) {   // reverse rows
                int start = num;
                int end = num + i - 1;

                for (int j = end; j >= start; j--) {
                    System.out.print(j + " ");
                }
                num = end + 1;  // update num
            } 
            else {               // normal rows
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num++;
                }
            }

            System.out.println();
        }
    }
}
