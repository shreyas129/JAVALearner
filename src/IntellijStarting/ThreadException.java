package IntellijStarting;

public class ThreadException {
    public static void main(String[] args) {
        Thread t = new Thread(new Thread2());
        t.start();
        System.out.println("program ends ");
    }
}

class Thread2 implements Runnable {
    public void run() {
        System.out.println("run");
        throw new RuntimeException("some errror");
    }
}