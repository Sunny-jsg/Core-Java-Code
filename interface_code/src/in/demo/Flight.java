package in.demo;

public class Flight implements MakeMyTrip{

	@Override
	public void booking() {
		System.out.println("Flight Ticket Booked ");
		
	}

	@Override
	public void price() {
		System.out.println("Price : 8000.00");
		
	}

}
