public class Consumer extends Thread {
    private final Queue queue;

    public Consumer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int index = 0;
        while (index < 1000) {
            int a = queue.get();
            index++;
        }
    }
}
