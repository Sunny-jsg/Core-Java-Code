package in.demo;

public class Demo<E> {

	private E var;

	public void add(E e) {
		var = e;
	}

	public E get() {
		
		return var;
	}

}
