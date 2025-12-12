package in.jspider;

public class AnimalDemo {
	public static void main(String[] args) {
		Animal[] a = {new Dog(),new Cat(),new Cat(), new Dog()};
		

		for (Animal an : a) {
			System.out.println(an);
			an.makeSound(); // runtime polymorphism

			if (an instanceof Dog) {
				((Dog) an).jump(); // Downcasting to call jump() }

			}
			if(an instanceof Cat) {
				Cat c = (Cat)an;
				c.eat();
			}
		}
	}

}
