import java.util.LinkedList;

public class Queue {
    private final LinkedList<Integer> LinkedList = new LinkedList<>();

    public void add(int num) {
        synchronized (this) {
            while (LinkedList.size() >= 1000) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            LinkedList.add(num);
            System.out.println("Added: " + num + ", size: " + LinkedList.size());
            notify();
        }
    }

    public int get() {
        synchronized (this) {
            while (LinkedList.size() < 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int rv = LinkedList.remove(0);
            System.out.println("Get: " + rv + " size: " + LinkedList.size());

            notify();
            return rv;
        }
    }
}
