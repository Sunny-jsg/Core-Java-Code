package in.sa;

public class MyQueue {
	Object[] arr;
	int size = 0;

	public MyQueue() {
		arr = new Object[5];
	}

	public MyQueue(int initialSize) {
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
		if (size == arr.length) {
			grow();
		}
		arr[size] = value;
		size++;
	}

	public Object poll() {
		if (isEmpty()) {
            return null;
        }
		Object key = arr[0];
		for (int i = 1; i < size; i++) {
			arr[i - 1] = arr[i];
			 
		}
		arr[size - 1] = null; 
        size--;

		return key;
	}

	public Object peek() {
		if (isEmpty()) {
            return null;
        }
		
		Object key = arr[0];
		return key;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

}
