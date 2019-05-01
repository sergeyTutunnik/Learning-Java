package ru.stutunnik.examples.multithreading;

public class Q {

    int n;
    boolean valueSet = false;

    synchronized int get() {
        System.out.println("Get called");
        while (!valueSet)
            try {
                System.out.println("Get waiting");
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }

        System.out.println("Got: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        System.out.println("Put called: " + n);
        while (valueSet)
            try {
                System.out.println("Put waiting");
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }

        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();
    }
}
