package Thread.lock;

public class ObjectLevelLocking extends Thread{
    int counter =0;

    public final Object lock = new Object();
    public void incrementCounter() {
        synchronized (lock) {
            counter++;
        }
    }

    public int getCounter() throws InterruptedException {
        synchronized (lock) {
            return counter;
        }
    }
}