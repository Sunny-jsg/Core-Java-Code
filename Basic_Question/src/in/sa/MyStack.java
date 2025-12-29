package in.sa;

public class MyStack {
	Object[] arr;
	int size = 0;

	public MyStack() {
		arr = new Object[5];
	}

	public MyStack(int initialSize) {
		arr = new Object[initialSize];
	}

	public void grow() {
		Object[] temp = new Object[arr.length + 3];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
	}

	public void push(int value) {
		if (size == arr.length) {
			grow();
		}
		arr[size] = value;
		size++;
	}

	public Object pop() {
		if (isEmpty()) {
			return null;
		}
		Object key = arr[size - 1];
        arr[size - 1] = null; // avoid memory leak
        size--;

		return key;
	}

	public Object peek() {
		if (isEmpty()) {
			return null;
		}

		Object key = arr[size - 1];
		return key;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

}
