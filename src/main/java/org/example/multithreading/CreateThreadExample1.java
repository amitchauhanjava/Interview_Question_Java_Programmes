package org.example.multithreading;

public class CreateThreadExample1{

    public static Object sharedObject = new Object();

    public static void main(String[] args){
        System.out.println("Main Thread Started");
        Thread obj1 = new Thread(()->{
            System.out.println("thread is running");

        });
        obj1.start();

        Runnable runnable =()-> {
            System.out.println("thread 1 is started");
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getState());
            System.out.println(sharedObject.hashCode());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread 1 is completed");
        };
        Runnable runnable2 =()-> {
            System.out.println("thread 2 is started");
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getState());
            System.out.println(sharedObject.hashCode());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread 2 is completed");
        };
        Thread objThread = new Thread( runnable,"Runnable Thread 1");
//        objThread.setDaemon(true);
        objThread.start();
        Thread objThread2 = new Thread( runnable2,"Runnable Thread 2");
//        objThread.setDaemon(true);
        objThread2.start();
        System.out.println("Main Thread ended");
    }
}
