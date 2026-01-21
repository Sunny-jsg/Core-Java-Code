package in.thread;

class Thread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Child Thread :: " + i);
		}

	}

}

public class Daemon {
	public static void main(String[] args) {
		Thread2 t = new Thread2();
		Thread t2 = new Thread(t);
		t2.setDaemon(true);
		t2.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println("Main Thread :: " + i);
			if (i == 6) {
				System.out.println(i / 0);
			}
		}
	}
}
