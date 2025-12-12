package in.ait;

public class ToString_Demo {
	int i =10;
	public static void main(String[] args)  throws Exception{
		
		String str1 = new String("Radha");
		String str2 = new String("Radha");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		Student s = new Student(1, "Sunny");
		System.out.println(s);
		System.out.println(s.toString());
		Student s1 = new Student(1, "Sunny");
		System.out.println(s1);
		System.out.println(s.getClass().getName());
		System.out.println(s1.getClass().getName());
		System.out.println(s1.hashCode());
		System.out.println(s.hashCode());
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		Student s3 = Student.class.getDeclaredConstructor(int.class,String.class).newInstance(3,"Mohan");
		System.out.println(s3);
		ToString_Demo td = ToString_Demo.class.getDeclaredConstructor().newInstance();
		System.out.println(td.i);
		Student s4 =(Student)s1.clone();
		System.out.println(s4);
	}

}
