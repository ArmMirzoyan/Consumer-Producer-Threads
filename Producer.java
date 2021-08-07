public class Producer extends Thread {
    private final Queue queue;

    public Producer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int index = 0;
        while (index < 1000) {
            queue.add(index);
            index++;
        }
    }
}
