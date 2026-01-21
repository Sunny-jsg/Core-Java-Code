package in.stream;

public class Persons {
	private String name;
	private String loc;
	private double salary;

	public Persons(String name, String loc, double salary) {
		this.name = name;
		this.loc = loc;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Persons [name=" + name + ", loc=" + loc + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
