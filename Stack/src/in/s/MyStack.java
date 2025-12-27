package in.s;

public class MyStack {

	private Node head;
	int size;

	public MyStack() {
		this.size = 0;
	}

	public void push(int value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
			size++;
			return;
		}
		node.next = head;
		head = node;
		size++;
	}

	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		int key = head.value;
		head = head.next;
		size--;
		return key;
	}

	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return head.value;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " ==>");
			temp = temp.next;
		}
		System.out.println("END");
	}

	class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

	}

}
