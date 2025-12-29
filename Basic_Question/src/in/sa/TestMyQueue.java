package in.sa;

public class TestMyQueue {
    public static void main(String[] args) {

        MyQueue m = new MyQueue();

        // Test isEmpty on new queue
        System.out.println("Is Empty: " + m.isEmpty()); // true

        // Add elements (also tests grow())
        m.add(10);
        m.add(20);
        m.add(30);
        m.add(40);
        m.add(50);
        m.add(60); // triggers grow()

        // Test size after adds
        System.out.println("Size after add: " + m.size()); // 6

        // Test peek
        System.out.println("Peek: " + m.peek()); // 10

        // Test poll (FIFO)
        System.out.println("Poll: " + m.poll()); // 10
        System.out.println("Poll: " + m.poll()); // 20

        // Test size after poll
        System.out.println("Size after poll: " + m.size()); // 4

        // Test peek again
        System.out.println("Peek after poll: " + m.peek()); // 30

        // Remove all elements
        while (!m.isEmpty()) {
            System.out.println("Polling: " + m.poll());
        }

        // Test empty queue behavior
        System.out.println("Is Empty after all polls: " + m.isEmpty()); // true
        System.out.println("Poll on empty queue: " + m.poll()); // null
        System.out.println("Peek on empty queue: " + m.peek()); // null
    }
}
