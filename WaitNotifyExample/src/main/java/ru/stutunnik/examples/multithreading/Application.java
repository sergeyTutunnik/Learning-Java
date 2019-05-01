package ru.stutunnik.examples.multithreading;

public class Application {

    public static void main(String[] args) {

        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q, "con1");
        Consumer c2 = new Consumer(q, "con2");
        Consumer c3 = new Consumer(q, "con3");
        Consumer c4 = new Consumer(q, "con4");

        p.t.start();
        c.t.start();
        c2.t.start();
        c3.t.start();
        c4.t.start();

        System.out.println("Press Control-C to stop.");
    }
}
