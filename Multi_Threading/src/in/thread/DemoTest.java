package in.thread;

public class DemoTest {
    public static void main(String[] args) {

        Demo d = new Demo();

        // synchronized access
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                d.withdraw(500);
            }
        }, "Thread-1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                d.withdraw(500);
            }
        }, "Thread-2");

        // non-synchronized access
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                d.checkBalance();
            }
        }, "Thread-3");

        // volatile example
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                d.work();
            }
        }, "Thread-4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        d.stop(); // volatile change
    }
}
