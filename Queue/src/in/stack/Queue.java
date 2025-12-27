package in.stack;

public class Queue {

	private Object[] arr;
	private int size = 0;

	Queue() {
		arr = new Object[10];
	}

	Queue(int initialSize) {
		arr = new Object[initialSize];
	}

	public void grow() {
		Object[] temp = new Object[arr.length + 3];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
	}

	public void add(int value) {
		if(size == arr.length) {
			grow();
		}
		arr[size] = value;
		size++;
	}

	public int poll() {
		int key = (int) arr[0];
	
		for (int i = 1; i < size; i++) {
			arr[i - 1] = arr[i];
		}

		arr[size - 1] = null;
		size--;
		return key;

	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public int peek() {
		return (int) arr[0];
	}

}
