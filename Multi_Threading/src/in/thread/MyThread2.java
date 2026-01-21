package in.thread;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		for (int i = 1; i <= 5; i++) {
			System.out.println(t.getName() + " My thread " + i);
		}
	}

	public static void main(String[] args) {
		MyThread2 m1 = new MyThread2();
		MyThread2 m2 = new MyThread2();
		MyThread2 m3 = new MyThread2();
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		Thread t3 = new Thread(m3);
		t1.start();
		t2.start();
		t3.start();

	}

}
