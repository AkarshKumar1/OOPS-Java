// W.A.P in Java to create a thread that Implement the Runnable interface. {Code - 15}

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Thread: " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) { }
        }
    }
}

public class Runnable_Interface {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }

}
