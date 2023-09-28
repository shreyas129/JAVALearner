package IntellijStarting;

class ThreadId {
    synchronized void hit(long n) {
        for (int i = 1; i < 3; i++) {
            System.out.print(n + "-" +  i + " ");
        }
    }
}

public class MyThread implements Runnable {
    static ThreadId ti = new ThreadId();

    public static void main(String...a) {
        new Thread(new MyThread()).start();
        new Thread(new MyThread()).start();
    }
    public void run(){
        ti.hit(Thread.currentThread().getId());
    }
}
