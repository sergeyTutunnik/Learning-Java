package ru.stutunnik.example.multithreading;

public class Deadlock implements Runnable {

    A a = new A();
    B b = new B();
    Thread t;

    public Deadlock() {
        //set name for this thread
        Thread.currentThread().setName("MainThread");
        //init other thread
        t = new Thread(this, "RacingThread");
    }

    public void run() {
        b.bar(a); //get lock on B in other thread.
        System.out.println("Back in other thread");
    }

    void deadlockStart() {
        //start other thread
        t.start();
        //call foo from this thread
        a.foo(b); //get lock on A in this thread.
        System.out.println("Back in main thread");
    }

    public static void main(String[] arg) {

        Deadlock dl = new Deadlock();
        dl.deadlockStart();
    }
}
