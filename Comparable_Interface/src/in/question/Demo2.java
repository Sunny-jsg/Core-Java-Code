package in.question;

import java.util.Arrays;

public class Demo2 { 
	public static void main(String[] args) {
		Employee [] emp = new Employee[5];
		emp[0]  = new Employee("Manju", 39000.00);
		emp[1] = new Employee("Sanju", 25000.00);
		emp[2] = new Employee("Mohan", 35000.00);
		emp[3] = new Employee("Sohan", 32000.00);
		emp[4] = new Employee("Raju", 31000.00);
		Sort.sort(emp);
		for(Employee e : emp) {
			System.out.println(e);
		}
	}

}
