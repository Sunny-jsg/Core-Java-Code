package in.loop;

public class Test {
    public static void main(String[] args) {
        int num = 29999;
        int sum = 0;

        while (num > 9) {  // repeat until num becomes a single digit
            sum = 0;
            while (num > 0) {
                sum += num % 10; // add last digit
                num /= 10;       // remove last digit
            }
            num = sum;  // new number is the sum of digits
        }

        System.out.println("Final single digit sum = " + num);
    }
}
