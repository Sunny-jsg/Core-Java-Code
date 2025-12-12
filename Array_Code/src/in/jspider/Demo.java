package in.jspider;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {
	 public static void main(String[] args) {
	        Circle[] a = new Circle[5];
	        a[0] = new Circle(45);
	        a[1] = new Circle(10);
	        a[2] = new Circle(50);
	        a[3] = new Circle(5);
            a[4] = new Circle(20);
            // Sorting using Comparator
            Arrays.sort(a, new Comparator<Circle>() {
                @Override
                public int compare(Circle c1, Circle c2) {
                    return c1.radius - c2.radius; // ascending order
                }
            });
	        for (Circle c : a) {
	            System.out.println(c);
	        }
	    }

}
