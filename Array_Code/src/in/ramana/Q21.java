package in.ramana;

public class Q21 {
    public static void main(String[] args) {
        int[] arr = {23, 55, 57, 93, 10, 1};

        for (int i = 0; i < arr.length; i++) {

            int temp = arr[i];
            int sum = 0;

            // step 1: sum of digits
            while (temp > 0) {
                int d = temp % 10;
                sum += d;
                temp /= 10;
            }

            // step 2: reduce until single digit
            while (sum > 9) {
                int t = sum;
                int newsum = 0;

                while (t > 0) {
                    newsum += t % 10;
                    t /= 10;
                }
                sum = newsum;
            }

            System.out.println(sum);
        }
    }
}
