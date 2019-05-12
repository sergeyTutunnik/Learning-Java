package ru.stutunnik.examples.multithreading;

public class NewThread implements Runnable {


    String name;
    Thread t;
    boolean suspendFlag;

    public NewThread(String threadName) {
        name = threadName;
        this.t = new Thread(this, name);
        this.suspendFlag = false;
    }

    public void run() {
        try {
            for (int i = 15; i > 0; i--) {

                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted");
        }
        System.out.println(name + " exiting");
    }

    synchronized void suspend() {
        suspendFlag = true;
    }

    synchronized void resume() {
        suspendFlag = false;
        notify();
    }
}
