package in.ll;

public class DLL {
	public static void main(String[] args) {
		DoublyLinkedList<Integer> dl = new DoublyLinkedList();
	   
		dl.add(10);
		dl.add(20);
		dl.add(30);
		dl.add(40);
		dl.set(45, 1);
		dl.display();
	}

}
