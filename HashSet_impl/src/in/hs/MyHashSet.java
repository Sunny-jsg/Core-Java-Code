package in.hs;

public class MyHashSet {
	Node[] a = new Node[10];
	int count = 0;
	Boolean containsNull = false;

	public boolean add(Object ele) {
		if (ele == null) {
			if (containsNull)
				return false;
			containsNull = true;
			count++;
			return true;
		}

		int index = Math.abs(ele.hashCode() % a.length);
		Node n = new Node(ele);

		if (a[index] == null) {
			a[index] = n;
			count++;
			return true;
		}

		Node curr = a[index];

		while (true) {
			if (curr.ele.equals(ele)) {
				return false; // duplicate found
			}
			if (curr.next == null) {
				break;
			}
			curr = curr.next;
		}

		curr.next = n;
		count++;
		return true;
	}

	public void display() {
		for (int i = 0; i < a.length; i++) {
			System.out.print(i + " : ");
			Node curr = a[i];

			if (curr == null) {
				System.out.println("null");
				continue;
			}

			while (curr != null) {
				System.out.print(curr.ele + " -> ");
				curr = curr.next;
			}
			System.out.println("null");
		}
	}

	class Node {
		Object ele;
		Node next;

		public Node(Object ele) {
			this.ele = ele;

		}

		public Node(Object ele, Node next) {
			this.ele = ele;
			this.next = next;
		}

	}

}
