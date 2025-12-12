package in.demo;

public class UpiPayment implements Payment {
	public void pay(int amount) {
		System.out.println("Paid ₹" + amount + " using UPI");
	}

}
