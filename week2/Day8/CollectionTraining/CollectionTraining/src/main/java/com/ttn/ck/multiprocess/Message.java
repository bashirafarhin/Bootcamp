package com.ttn.ck.multiprocess;

class Message {
    private String message;

    public synchronized String readMessage() {
        return message;
    }

    public synchronized void writeMessage(String message) {
        this.message = message;
    }
}