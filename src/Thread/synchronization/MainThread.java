package Thread.synchronization;

public class MainThread {

    public static void main(String[] args) throws Exception{

        ThreadRun inc = new ThreadRun();
        Thread t1 = new Thread(() -> {
            for(int i=1; i<=1000; i++) {
                inc.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=1; i<=1000; i++) {
                inc.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count is : "+ inc.count);
        System.out.println("Count 2 is : "+ inc.count2);

    }
}
