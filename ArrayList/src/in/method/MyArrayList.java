package in.method;

import java.util.Arrays;

public class MyArrayList<E> {

    private Object[] arr;
    private int size = 0;

    // constructor
    public MyArrayList() {
        arr = new Object[5];
    }
    public MyArrayList(int initialsize) {
    	arr =new Object[initialsize];
    }

    // add element
    public void add(E element) {
        if (size == arr.length) {
            grow();
        }
        arr[size++] = element;
    }

    // grow array
    private void grow() {
        Object[] temp = new Object[arr.length + 3];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    // get element
    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        return (E) arr[index];
    }

    // remove element
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[size - 1] = null;
        size--;
    }

    // size
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(arr, size));
    }
}
