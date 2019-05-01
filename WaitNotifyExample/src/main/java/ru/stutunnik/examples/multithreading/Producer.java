package ru.stutunnik.examples.multithreading;

public class Producer implements Runnable {

    Q q;
    Thread t;

    public Producer(Q q) {
        this.q = q;
        this.t = new Thread(this, "Producer");
    }

    public void run() {

        int i = 0;
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            q.put(i++);
        }
    }
}
