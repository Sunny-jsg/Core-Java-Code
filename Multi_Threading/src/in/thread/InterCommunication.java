package in.thread;

class Bank {

	int balance = 0;

	public Bank(int balance) {
		this.balance = balance;
	}

	public synchronized void deposit(int amount) {
		System.out.println("Going to deposite..");
		balance += amount;
		notify();
		System.out.println("Deposit Sucessfully Completed 😎");
	}

	public synchronized void withdraw(int amount) throws InterruptedException {
		if (amount > balance) {
			System.out.println("Less Balance 😒");
		}
		wait();
		balance -= amount;
		System.out.println("Withdraw Sucessfully Completed 😉");
		System.out.println("Available Balance : " + balance);
	}

}

public class InterCommunication {
	public static void main(String[] args) {
		Bank b = new Bank(4000);
		new Thread() {

			public void run() {
				try {
					b.withdraw(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}.start();
		new Thread() {
			@Override
			public void run() {
				b.deposit(5000);
			}
		}.start();

	}

}
