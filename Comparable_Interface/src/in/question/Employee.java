package in.question;

public class Employee implements Comparable{
	int id;
	String name;
	double salary;
	private static int num =101;
	public Employee(String name, double salary) {
		id =num++;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int compareTo(Object o) {
		Employee e = (Employee)o;
		return (int)this.salary-(int)e.salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
