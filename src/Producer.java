public class Producer implements Runnable {
    private final MyQueue<Integer> myQueue;

    public Producer(MyQueue<Integer> myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            myQueue.put(i);
        }
    }
}