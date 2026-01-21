package in.stream;

public class Employee {
	String name;
	double salary;
	int age;
	String loc;
	public Employee(String name, double salary, int age,String loc) {
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.loc =loc;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
	
	

}
