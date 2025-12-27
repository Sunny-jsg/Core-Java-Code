package in.ll;

public class MyLinkedList<E> {
   // ✨✨✨✨✨ In LinkedList, nodes are not removed from memory — references are changed.
	private Node<E> head;
	private Node<E> tail;
	private int size;

	public MyLinkedList() {
		this.size = 0;
	}

	// add in insertion order (like ArrayList.add)
	public void add(E val) {
		Node<E> node = new Node<>(val);

		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
		size++;
	}

	public void insertFirst(E val) {
		Node<E> node = new Node<>(val);
		node.next = head;
		head = node;

		if (tail == null) {
			tail = head;
		}
		size++;
	}

	public void insertLast(E val) {
		if (tail == null) {
			insertFirst(val);
			return;
		}

		Node<E> node = new Node<>(val);
		tail.next = node;
		tail = node;
		size++;
	}

	public void insertBasedOnIndex(E val, int index) {

		// ✅ FIXED index validation
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Invalid Index");
		}

		if (index == 0) {
			insertFirst(val);
			return;
		}

		if (index == size) {
			insertLast(val);
			return;
		}

		Node<E> temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}

		Node<E> node = new Node<>(val, temp.next);
		temp.next = node;
		size++;
	}

	public void display() {
		Node<E> temp = head;
		while (temp != null) {
			System.out.print(temp.value + " --> ");
			temp = temp.next;
		}
		System.out.println("END");
	}

	// ==================Delete 😎============================
	public E deleteFirst() {
		E value = head.value;
		head = head.next;

		if (head == null) {
			tail = null;
		}

		size--;
		return value;
	}

	public E deleteLast() {
		if (size <= 1) {
			return deleteFirst();
		}

		Node<E> secondLast = get(size - 2);
		E value = tail.value;

		tail = secondLast;
		tail.next = null;
		size--;

		return value;
	}

	public E delete(int index) {
		if (index == 0) {
			return deleteFirst();
		}
		if (index == size - 1) {
			return deleteLast();
		}

		Node<E> prev = get(index - 1);
		E value = prev.next.value;

		prev.next = prev.next.next;
		size--;

		return value;
	}

	public Node<E> find(E value) {
		Node<E> temp = head;

		while (temp != null) {
			if (temp.value.equals(value)) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}

	public Node<E> get(int index) {
		Node node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}

	// =================NODE CLASS =================
	private static class Node<E> {
		private E value;
		private Node<E> next;

		public Node(E value) {
			this.value = value;
		}

		public Node(E value, Node<E> next) {
			this.value = value;
			this.next = next;
		}
		@Override
		public String toString() {
		    return String.valueOf(value);
		}
	}
//=============================================================
	
	

}
//==================================================
   
