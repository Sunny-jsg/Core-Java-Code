package in.type.innerclass;

public class Regular {
	private int i = 10;
	final static int j = 20;

	private class B {
		void m1() {
			System.out.println(i);
			System.out.println(j);
		}

	}

	public static void main(String[] args) {
		Regular r = new Regular();
		B b = r.new B();
		b.m1();
	}

}
