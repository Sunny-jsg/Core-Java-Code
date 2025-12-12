package in.test;

public class Child  extends Parent{
	int x = 10;

    Child() {
        System.out.println("Child Constructor");
    }

    @Override
    void show() {
        System.out.println("Child show(), x = " + x);
    }

    public static void main(String[] args) {
        new Child();
    }
}
