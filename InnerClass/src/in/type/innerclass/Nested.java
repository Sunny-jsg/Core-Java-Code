package in.type.innerclass;

public class Nested {
	static int i = 10;
    static int j =20;
	static class B {
		public static void main(String[] args) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		System.out.println(j);
	}

}
