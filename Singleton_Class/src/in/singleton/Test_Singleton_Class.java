package in.singleton;

public class Test_Singleton_Class {
	public static void main(String[] args) {
		Singleton_Class sc1 = Singleton_Class.singletonMethod();
		Singleton_Class sc2 = Singleton_Class.singletonMethod();
		System.out.println(sc1.hashCode());
		System.out.println(sc2.hashCode());
		System.out.println(sc1 == sc2);
	}

}
