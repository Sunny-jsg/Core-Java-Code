package in.type.innerclass;

interface T1 {
	void m1();

}

public class Annonymus {
	public static void main(String[] args) {
		T1 t = new T1() {

			@Override
			public void m1() {
				System.out.println("m1() is Executed ");
			}

			public void m2() {
				System.out.println("m2() is Annoy");
			}

		};
		t.m1();

	}

}
/*
 * interface T1 { void m1(); }
 * 
 * public class Anonymous { public static void main(String[] args) { T1 t = new
 * T1() {
 * 
 * @Override public void m1() { System.out.println("m1() is Executed"); } };
 * 
 * t.m1(); } }
 */