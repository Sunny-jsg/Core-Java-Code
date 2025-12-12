package in.question;

public class Circle implements Comparable {
	int radius;
	public Circle(int radius) {
		this.radius =radius;
	}
	@Override
	public int compareTo(Object o) {
		
		return this.radius-((Circle)o).radius;
	}

}
