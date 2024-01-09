package Thread.lock;
public class MainThread {
    public static void main(String[] args) throws InterruptedException {

        ObjectLevelLocking ob = new ObjectLevelLocking();

        Thread t1 = new Thread(() -> {
            for(int i=1; i<=1000; i++){
                try {
                    Thread.yield();
                    ob.incrementCounter();
                    System.out.println("C1 + "+ ob.getCounter());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i=1; i<=1000; i++){

                try {
                    ob.incrementCounter();
                    System.out.println("C2 + "+ ob.getCounter());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }) {
            public void run() {
                System.out.println("Hii");
            }
        };

        //t1.start();
        t2.start();

        //t1.join();
        t2.join();

        System.out.println("Count : "+ ob.getCounter());
    }
}
