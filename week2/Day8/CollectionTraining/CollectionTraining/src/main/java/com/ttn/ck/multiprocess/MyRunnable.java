package com.ttn.ck.multiprocess;

class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is executing.");
        try {
            Thread.sleep(1000);  // Sleep for 1 second
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted.");
        }
        System.out.println(name + " has finished execution.");
    }
}