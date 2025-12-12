package map_concept.in;

public class Student implements Comparable<Student> {

	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		return o.id - this.id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
/*
 * Goal compareTo() Logic Sort by ID (ascending) return this.id - other.id; Sort
 * by ID (descending) return other.id - this.id; Sort by Name (A → Z) return
 * this.name.compareTo(other.name); Sort by Name (Z → A) return
 * other.name.compareTo(this.name);
 */