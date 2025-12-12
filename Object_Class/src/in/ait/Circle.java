package in.ait;

public class Circle {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
        
	}
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Circle)) return false;
		return this.radius == ((Circle) o).radius;
	}
	@Override
	public String toString() {
		return "Circle [ radius = " + radius + "]";
	}

}
