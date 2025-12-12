package in.example;

public class G_Pay {
	
	public static  void payment(String a,int b) {
		System.out.println(b +" : "+" Payment Done By UPI ::: Thankyou ???");
	}
	public static  void payment(String c,Double  d) {
		System.out.println(d +" :" +" Payment Done By Cash ::: Thankyou ???");
	}
	public static void main(String[] args) {
		payment("74372384@yml", 500);
		payment("Cash", 200.0);
	}

}
