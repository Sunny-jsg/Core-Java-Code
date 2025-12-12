package in.singleton;

public class Test_MovieHall {
	public static void main(String[] args) {
		MovieHall m1 = MovieHall.hallTicket();
		m1.bookSeat(40);
		m1.bookSeat(5);
		MovieHall m2 = MovieHall.hallTicket();
		m2.bookSeat(3);
		m2.bookSeat(2);
		m1.bookSeat(10);
	}

}
