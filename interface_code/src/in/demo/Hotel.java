package in.demo;

public class Hotel implements MakeMyTrip {

	@Override
	public void booking() {
		System.out.println("Hotel Room Booked");
		
	}

	@Override
	public void price() {
		System.out.println("Price : 2000/day");
	}

}
