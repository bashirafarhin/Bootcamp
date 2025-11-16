package com.ttn.ck.multiprocess;

class Consumer implements Runnable {
    private Message message;

    public Consumer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            synchronized (message) {
                try {
                    while (message.readMessage() == null) {
                        message.wait();  // Wait until the message is produced
                    }
                    System.out.println("Consumer: " + message.readMessage());
                    message.writeMessage(null);  // Reset message after consuming
                } catch (InterruptedException e) {
                    System.out.println("Consumer was interrupted.");
                }
            }
        }
    }
}
