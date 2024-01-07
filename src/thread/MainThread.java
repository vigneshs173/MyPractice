package thread;

public class MainThread {

    public static void main(String[] args) {
        ThreadChild threadChild = new ThreadChild();
        threadChild.start();

        for(int i=0; i<5; i++){
            System.out.println("Main Thread");
        }
    }
}
