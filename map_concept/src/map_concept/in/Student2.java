package map_concept.in;

public class Student2 {
	int id;
    String name;

    Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }

}
