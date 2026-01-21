package in.stream;

import java.util.Arrays;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		List<String> JavaCourse = Arrays.asList("CoreJava", "Spring", "Springboot", "AdvJava");
		List<String> UiCourse = Arrays.asList("HTML", "CSS", "BS", "JS");
		List<List<String>> course = Arrays.asList(JavaCourse, UiCourse);
		course.stream().flatMap(s -> s.stream()).forEach(i -> System.out.println(i));
	}

}
