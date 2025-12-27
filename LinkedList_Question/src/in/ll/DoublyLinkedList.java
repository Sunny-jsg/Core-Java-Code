package in.ll;

public class DoublyLinkedList<E> {

	private Node<E> head;
	private Node<E> tail;
	private int size;

	// ================= ADD AT END =================
	public void add(E value) {
		Node<E> node = new Node<>(value);

		if (head == null) {
			head = node;
			size++;
			return;
		}

		Node<E> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = node;
		node.prev = temp;
		size++;
	}

	public void set(E value, int index) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Invalid index: " + index);
		}
		Node node = new Node(value);
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		temp.value = value;

	}

	// ================= INSERT AT INDEX =================
	public void addIndex(E value, int index) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Invalid index: " + index);
		}

		if (index == 0) {
			insertFirst(value);
			return;
		}

		if (index == size) {
			insertLast(value);
			return;
		}

		Node<E> temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}

		Node<E> node = new Node<>(value);

		node.prev = temp;
		node.next = temp.next;
		if (node.next != null) {
			temp.next.prev = node;
		}
		temp.next = node;

		size++;
	}

	// ================= INSERT FIRST =================
	public void insertFirst(E value) {
		Node<E> node = new Node<>(value);

		node.next = head;
		node.prev = null;

		if (head != null) {
			head.prev = node;
		}

		head = node;
		size++;
	}

	// ================= INSERT LAST =================
	public void insertLast(E value) {
		Node<E> node = new Node<>(value);

		if (head == null) {
			head = node;
			size++;
			return;
		}

		Node<E> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = node;
		node.prev = temp;
		size++;
	}

	// ================= FIND =================
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

	// ================= DISPLAY =================
	public void display() {
		Node<E> temp = head;
		Node<E> last = null;

		while (temp != null) {
			last = temp;
			System.out.print(temp.value + " ⇄ ");
			temp = temp.next;
		}
		System.out.println("END");
	}

	public void reverse() {
		Node temp = tail;

		while (temp != null) {
			System.out.print(temp.value + " ⇄ ");
			temp = temp.prev;
		}
		System.out.println("START");
	}

	// ================= NODE CLASS =================
	private static class Node<E> {
		E value;
		Node<E> next;
		Node<E> prev;

		Node(E value) {
			this.value = value;
		}

		public Node(E value, Node<E> next, Node<E> prev) {
			super();
			this.value = value;
			this.next = next;
			this.prev = prev;
		}

	}
}
