package in.j_ait;

import java.util.Arrays;
import java.util.List;

import in.stream.Persons;

public class PersonStream {
	public static void main(String[] args) {
		Persons p1 = new Persons("Sunny", "Hyderabad", 45000);
		Persons p2 = new Persons("Rahul", "Bangalore", 52000);
		Persons p3 = new Persons("Priya", "Chennai", 48000);
		Persons p4 = new Persons("Amit", "Pune", 50000);
		Persons p5 = new Persons("Neha", "Delhi", 47000);
		Persons p6 = new Persons("Vikram", "Mumbai", 55000);
		Persons p7 = new Persons("Anjali", "Kolkata", 46000);
		Persons p8 = new Persons("Karthik", "Coimbatore", 43000);
		Persons p9 = new Persons("Riya", "Jaipur", 42000);
		Persons p10 = new Persons("Arjun", "Kochi", 49000);
		List<Persons> list = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
		boolean status1 = list.stream().anyMatch(p -> p.getLoc().equals("Bangalore"));
		System.out.println(status1);
		boolean status2 = list.stream().allMatch(i -> i.getLoc().equals("Pune"));
		System.out.println(status2);
		boolean status3 = list.stream().noneMatch(i -> i.getLoc().equals("Bihar"));
		System.out.println(status3);
	}

}
