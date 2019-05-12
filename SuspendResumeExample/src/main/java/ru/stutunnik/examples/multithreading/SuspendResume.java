package ru.stutunnik.examples.multithreading;

public class SuspendResume {

    public static void main(String[] args) {

        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");

        ob1.t.start();
        ob2.t.start();


        try {
            Thread.sleep(1000);
            ob1.suspend();
            System.out.println("Suspending thread one");
            Thread.sleep(1000);
            ob1.resume();
            System.out.println("Resuming thread one");

            Thread.sleep(1000);
            ob2.suspend();
            System.out.println("Suspending thread two");
            Thread.sleep(1000);
            ob2.resume();
            System.out.println("Resuming thread two");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }


        try {
            System.out.println("Waiting for threads to finish");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread finishing");
    }
}
