package in.method;

public class TestMyArrayList {
    public static void main(String[] args) {

        MyArrayList al = new MyArrayList(6);

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);

        System.out.println(al);        // [10, 20, 30, 40, 50, 60]
        System.out.println(al.size()); // 6

        System.out.println(al.get(2)); // 30

        al.remove(3);
        System.out.println(al);        // [10, 20, 30, 50, 60]
    }
}
