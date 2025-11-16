package com.ttn.ck.multiprocess;

public class ThreadMain {

    public static void main(String[] args) {

        // Thread creation using Runnable interface
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));

        System.out.println("Starting threads...");
        thread1.start();  // This will call run() method internally
        thread2.start();

        // Demonstrate Thread Sleep
        try {
            Thread.sleep(2000);  // Main thread sleeps for 2 seconds before proceeding
            System.out.println("Main thread is awake after 2 seconds.");
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        // Demonstrate Thread Join
        try {
            thread1.join();  // Main thread will wait for thread1 to complete
            System.out.println("Thread 1 has finished execution.");
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted while waiting for thread1.");
        }

        // Demonstrating synchronized block to avoid race condition
        Counter counter = new Counter();
        Thread t1 = new Thread(new IncrementTask(counter), "Incrementer 1");
        Thread t2 = new Thread(new IncrementTask(counter), "Incrementer 2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted while waiting for incrementers.");
        }

        System.out.println("Final counter value: " + counter.getCount());

        // Demonstrating thread communication using wait/notify
        Message message = new Message();
        Thread producer = new Thread(new Producer(message));
        Thread consumer = new Thread(new Consumer(message));

        producer.start();
        consumer.start();
    }
}
