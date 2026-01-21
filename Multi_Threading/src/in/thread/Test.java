package in.thread;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.setPriority(10);
		mt.start();

		System.out.println(t.getName());
		System.out.println(t.getPriority());

		for (int i = 10; i >= 1; i--) {
			//Thread.sleep(1000);
			System.out.println("Main Thread Value :: " + i);

		}
	}

}

class MyThread extends Thread {
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("MyThread Value  ::" + i);
		}
	}
}
