package in.j_ait;

import java.util.function.Predicate;

public class PrintNumberUsingRunnableInterface {
    public static void main(String[] args) {

        // Get main thread
        Thread mainThread = Thread.currentThread();
        System.out.println("Main Thread Name: " + mainThread.getName());
      
        Runnable r = () -> {
            Thread childThread = Thread.currentThread();
            for (int i = 1; i <= 5; i++) {
                System.out.println(childThread.getName() + " = " + i);
            }
        };

        Thread t = new Thread(r);
        t.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println(mainThread.getName() + " = " + i);
        }
    }
}
