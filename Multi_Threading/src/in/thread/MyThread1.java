package in.thread;

class MyThread5 extends Thread {

	int total = 0;

	@Override
	public void run() {

		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				total = total + i;
			}

			// notify main thread that calculation is done
			notify();
		}

		System.out.println("User Thread total: " + total);
	}
}

public class MyThread1 {
	public static void main(String[] args) {

		MyThread5 mt = new MyThread5();
		mt.start();

		synchronized (mt) {
			try {
				// main thread waits until child thread notifies
				mt.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// resumes after notify()
		System.out.println("Main Thread total: " + mt.total);
	}

}
//wait() → main thread pauses

//notify() → child thread wakes main thread

//synchronized → required for wait/notify

//Inter-thread communication using Object class methods
