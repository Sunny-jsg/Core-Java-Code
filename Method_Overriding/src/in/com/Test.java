package in.com;

public class Test {
	public static void main(String[] args) {
		Parent  p= new Child();
		System.out.println(p.a);
	}
	

}
 class Parent{
	 int a=10;
 }
 class Child extends Parent{
	 int a=20;
 }