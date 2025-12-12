package in.singleton;

public class MovieHall {
	int seats =50;
	public static MovieHall mh = null;
	private MovieHall() {
		
	}
	public static MovieHall hallTicket() {
		if(mh == null)
			mh = new MovieHall();
		return mh;
	}
	public void bookSeat(int num) {
		if(num  > seats ) {
			System.out.println( "seats are not  Available ");
			return;
		}
		seats -=num;
		System.out.println(num + " Searts Are Reserved ");
	}
	
}
