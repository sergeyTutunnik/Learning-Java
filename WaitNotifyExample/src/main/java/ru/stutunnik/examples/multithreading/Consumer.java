package ru.stutunnik.examples.multithreading;

public class Consumer implements Runnable {

    Q q;
    Thread t;
    String consumerCode;

    public Consumer(Q q, String consumerCode) {
        this.q = q;
        this.consumerCode = consumerCode;
        this.t = new Thread(this, "Consumer");
    }

    public void run() {

        while (true) {

            q.get(consumerCode);
        }
    }
}
