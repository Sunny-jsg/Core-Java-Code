package in.ait;

public class Test {
	public static void main(String[] args) {
		Circle c1 = new Circle(50);
		Circle c2 = new Circle(50);
		System.out.println(c1 ==c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1);
	}

}
