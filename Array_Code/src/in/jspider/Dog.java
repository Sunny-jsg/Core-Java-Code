package in.jspider;

public class Dog implements Animal {

	@Override
	public void makeSound() {
	   System.out.println("bow bow");
		
	}
	 public void jump() {
	        System.out.println("jumped");
	    }
	 @Override
	 public String toString() {
		return "Dog []";
	 }
	 

}
