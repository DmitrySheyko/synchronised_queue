public class Consumer implements Runnable {
    private final MyQueue<Integer> myQueue;

    public Consumer(MyQueue<Integer> myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
                myQueue.get();
        }
    }
}