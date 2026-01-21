package in.thread;

class Demo {

    // 1️⃣ volatile variable (visibility only)
    volatile boolean running = true;

    // shared data
    int balance = 1000;

    // 2️⃣ synchronized method (thread-safe)
    synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " entering withdraw");
        balance = balance - amount;
        System.out.println("Balance after withdraw: " + balance);
    }

    // 3️⃣ non-synchronized method (NOT thread-safe)
    void checkBalance() {
        System.out.println(Thread.currentThread().getName() +
                " checking balance: " + balance);
    }

    // method using volatile
    void stop() {
        running = false;
    }

    void work() {
        while (running) {
            // server running
        }
        System.out.println("Server stopped");
    }
}
