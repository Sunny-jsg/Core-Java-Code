package in.type.innerclass;

public class InsideMethod {
	public static void main(String[] args) {
		class B{
			public void add(int n ,int m) {
				System.out.println("Sum : " + ( n + m));
			}
		}
		B b = new B();
		b.add(10,20);
		
	}

}
