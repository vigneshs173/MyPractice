package Thread.simpleThread;

public class MainThread {

    public static void main(String[] args) throws InterruptedException {
        ThreadChild threadChild = new ThreadChild();
        threadChild.start();
        //threadChild.join();
        threadChild.interrupt();
        for(int i=0; i<5; i++){
            System.out.println("Main Thread");
        }
    }
}
