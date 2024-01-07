package thread;

import com.sun.security.jgss.GSSUtil;

public class ThreadChild extends Thread{

    public void run() {
        for(int i=0; i<5; i++){

            System.out.println("Child Thread");
        }
    }
}
