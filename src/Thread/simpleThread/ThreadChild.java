package Thread.simpleThread;
public class ThreadChild extends Thread{

    public void run() {
        //Thread.yield();
        for(int i=0; i<5; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Child Thread");
            } catch (InterruptedException e) {
                System.out.println("Sleep was Interuptted");
            }
        }
    }
}
