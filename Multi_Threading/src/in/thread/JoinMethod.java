package in.thread;

class MyThread4 implements Runnable {

	private String name;

	MyThread4(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " started");

		try {
			Thread.sleep(1000); // simulate work
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(name + " finished");
	}
}

public class JoinMethod {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread4("Thread-1"));
		Thread t2 = new Thread(new MyThread4("Thread-2"));
		Thread t3 = new Thread(new MyThread4("Thread-3"));

		try {
			t1.start();
			t1.join(); // main waits until t1 finishes

			t2.start();
			t2.join(); // main waits until t2 finishes

			t3.start();
			t3.join(); // main waits until t3 finishes
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("All threads completed. Main ends.");
	}

}
