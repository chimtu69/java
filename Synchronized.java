// Aim : Write a java program to display snychronized msg with wait method and runnable interface.

public class Synchronized implements Runnable {
    public void run() {
        synchronized (this) {
            System.out.println("Synchronized block");
            try {
                wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Synchronized block end");
        }
    }

    public static void main(String[] args) {
        Synchronized obj = new Synchronized();
        Thread thread = new Thread(obj);
        thread.start();
    }
}

