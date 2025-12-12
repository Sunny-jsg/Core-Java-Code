package in.demo;

public class TestStart {
	public static void main(String[] args) {
		Startable [] things = {new Car(), new Drone(),new Computer()};
		for(Startable s : things) {
			s.start();
		}
	}

}
