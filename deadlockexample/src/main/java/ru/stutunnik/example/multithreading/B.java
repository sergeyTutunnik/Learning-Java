package ru.stutunnik.example.multithreading;

public class B {

    synchronized void bar(A a) {

        String name = Thread.currentThread().getName();

        System.out.println(name + " entered B.bar");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " trying to call B.last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("Inside B.last");
    }
}
