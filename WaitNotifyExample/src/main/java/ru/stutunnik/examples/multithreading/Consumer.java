package ru.stutunnik.examples.multithreading;

public class Consumer implements Runnable {

    Q q;
    Thread t;

    public Consumer(Q q) {
        this.q = q;
        this.t = new Thread(this, "Consumer");
    }

    public void run() {

        while (true) {
            q.get();
        }
    }
}
