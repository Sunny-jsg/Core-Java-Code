package in.s;

import java.util.Arrays;

public class MyStackArrayList {
	private Object[] arr;
	private int size = 0;

	public MyStackArrayList() {
		arr = new Object[5];
	}

	public MyStackArrayList(int intialSize) {
		arr = new Object[intialSize];
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

	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		int key = (int) arr[size - 1];
		arr[size - 1] = null;
		size--;
		return key;
	}

	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return (int) arr[size - 1];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		return "" + Arrays.toString(arr);
	}

}
