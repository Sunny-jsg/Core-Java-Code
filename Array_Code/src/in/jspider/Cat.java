package in.jspider;

public class Cat implements Animal {

	@Override
	public void makeSound() {
		System.out.println("meow");
		
	}
	public void eat() {
		System.out.println("Cat eats meats");
	}

	@Override
	public String toString() {
		return "Cat []";
	}
	

}
