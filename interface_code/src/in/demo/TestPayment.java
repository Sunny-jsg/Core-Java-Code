package in.demo;

public class TestPayment {
	public static void main(String[] args) {
		Checkout c = new Checkout();
        c.makePayment(new UpiPayment());
        c.makePayment(new CreditCardPayment());
	}

}
