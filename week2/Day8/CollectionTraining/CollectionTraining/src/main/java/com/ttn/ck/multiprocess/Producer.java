package com.ttn.ck.multiprocess;

class Producer implements Runnable {
    private Message message;

    public Producer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String[] messages = {"Hello", "How are you?", "Goodbye"};
        for (String msg : messages) {
            try {
                Thread.sleep(1000); // Simulate time to produce the message
                message.writeMessage(msg);
                System.out.println("Producer: " + msg);
                synchronized (message) {
                    message.notify();  // Notify the consumer that the message is ready
                }
            } catch (InterruptedException e) {
                System.out.println("Producer was interrupted.");
            }
        }
    }
}
