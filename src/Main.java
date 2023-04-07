public class Main {

    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();

        Consumer consumer = new Consumer(myQueue);
        Producer producer = new Producer(myQueue);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();
    }

}