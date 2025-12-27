package in.ll;

public class LL {
	public static void main(String[] args) {
		MyLinkedList<Integer> l = new MyLinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.insertFirst(5);
		l.insertLast(55);
		l.insertBasedOnIndex(35, 4);
		l.display();
		l.deleteFirst();
		l.display();
		l.deleteLast();
		l.display();
		l.delete(3);
		l.display();
	System.out.println(	l.find(40));
	}

}
