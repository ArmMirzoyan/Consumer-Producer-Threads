public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();

        Consumer consumer1 = new Consumer(queue);
        Consumer consumer2 = new Consumer(queue);
        Producer producer1 = new Producer(queue);
        Producer producer2 = new Producer(queue);

        consumer1.start();
        consumer2.start();
        producer1.start();
        producer2.start();
    }
}
