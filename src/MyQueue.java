public class MyQueue <T> {
    private T n;
    boolean valueSet = false;

    public synchronized void get(){
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Thread t = Thread.currentThread();
        System.out.println("Пoлyчeнo: " + n.toString() + ",  " + t.getName());
        valueSet = false;
        notify();
    }

    public synchronized void put(T n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        valueSet = true;
        this.n = n;
        Thread t = Thread.currentThread();
        System.out.println("Oтпpaвлeнo: " + n.toString() + ",  " + t.getName());
        notify();
    }
}