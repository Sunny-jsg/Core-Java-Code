package in.method;

import java.util.Arrays;

public class MyArrayList {
	private Object[] arr;
	private int size = 0;

	public MyArrayList() {
		arr = new Object[5];
	}

	public MyArrayList(int intialSize) {
		arr = new Object[intialSize];
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

	public int get(int index) {
		if (index < -1 || index >= size) {
			throw new IndexOutOfBoundsException();
		}

		return (int) arr[index];
	}

	public void remove(int index) {
		if (index < -1 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		for (int i = index; i < size - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[size - 1] = null;
		size--;

	}

	public void add(int value, int index) {
		if (index < -1 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		// grow array if full
		if (size == arr.length) {
			grow();
		}

		// shift elements to the right
		for (int i = size; i > index; i--) {
			arr[i] = arr[i - 1];
		}

		// insert element
		arr[index] = value;
		size++;
	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		return "" + Arrays.toString(arr);
	}

}
