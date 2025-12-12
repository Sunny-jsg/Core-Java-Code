package in.singleton;

public class TestDemo {
	public static void main(String[] args) {
		Demo d = Demo.sunny();
		Demo d1 = Demo.sunny();
		System.out.println(d.hashCode());
		System.out.println(d1.hashCode());
	}

}
