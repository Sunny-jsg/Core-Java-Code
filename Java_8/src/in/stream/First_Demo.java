package in.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class First_Demo {
	public static void main(String[] args) {
		/*
		 * Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5); List<String> s2 =
		 * Arrays.asList("Sunny", "Mohan", "Ram"); s2.stream().forEach(i ->
		 * System.out.println(i + " ")); s1.forEach(i -> System.out.print(i + " "));
		 */
		User u1 = new User("Sunny", 23);
		User u2 = new User("Mohan", 20);
		User u3 = new User("Sita", 13);
		User u4 = new User("Radha", 33);
		User u5 = new User("Ram", 12);
		User u6 = new User("Raju", 8);
		User u7 = new User("Rani", 17);
		Stream<User> stream = Stream.of(u1,u2,u3,u4,u5,u6,u7);
		stream.filter(i -> i.age>18 && i.name.startsWith("R")).forEach(i-> System.out.println(i));




		
		
	}

}
class User{
	String name;
	int age;
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "user [name=" + name + ", age=" + age+ "]";
	}
	
	
}