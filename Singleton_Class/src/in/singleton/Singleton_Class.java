package in.singleton;

public class Singleton_Class {
	public static Singleton_Class s = null;

	private Singleton_Class() {

	}
	public static Singleton_Class singletonMethod() {
		if(s == null)
			s = new Singleton_Class();
		return s;
	}
}
