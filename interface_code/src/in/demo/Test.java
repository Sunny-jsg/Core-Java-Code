package in.demo;

public class Test {
	public static void main(String[] args) {
		Booking b  = new Booking();
		b.Booking(new Train());
		System.out.println("---------------------------");
		b.Booking(new Flight());
		System.out.println("---------------------------");
		b.Booking(new Hotel());
		
		
	}

}
