package synchronization;

public class ThreadRun extends Thread{

    int count=0;
    int count2=0;
    public void increment() {
        count++;

        synchronized(ThreadRun.class) {
            count2++;
        }

    }
}
