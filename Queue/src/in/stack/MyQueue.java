package in.stack;

public class MyQueue {

	private Node head;
	private int size = 0;

	public void add(int value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
			size++;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
		size++;

	}

	public int poll() {
		int key = head.value;
		head = head.next;
		size--;
		return key;
	}

	public int peek() {
		return head.value;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next) {
			super();
			this.value = value;
			this.next = next;
		}

	}

}
