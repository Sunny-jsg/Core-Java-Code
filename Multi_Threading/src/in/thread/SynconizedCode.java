package in.thread;

class MyThread3 implements Runnable {
	

	@Override
	public  void run() {
         print();
	}

	public static synchronized void print() {
		Thread t = Thread.currentThread();
		for (int i = 1; i <= 5; i++) {
			System.out.println(t.getName() + " : " + i);
		}
	}

}

public class SynconizedCode {
	public static void main(String[] args) {
		 MyThread3 mt1 = new MyThread3();
	        MyThread3 mt2 = new MyThread3();

	        Thread t1 = new Thread(mt1, "Thread-1");
	        Thread t2 = new Thread(mt2, "Thread-2");

	        t1.start();
	        t2.start();
	}

}
