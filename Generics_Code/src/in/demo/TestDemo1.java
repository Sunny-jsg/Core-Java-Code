package in.demo;

public class TestDemo1 {
	public static void main(String[] args) {
		Demo<String> d = new Demo<String>();
		d.add("Hello");
		System.out.println(d.get());
	}

}
