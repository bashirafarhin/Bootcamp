//Concurrency
//
//Goal
//Implement Producer and Consumer threads that work together using a shared buffer.
//
//Requirements
//Producer generates numbers 1 to 50
//Consumer reads and prints the numbers
//Shared buffer size = 5
//Producer waits if buffer is full
//Consumer waits if buffer is empty
//Use wait() & notify()




class Buffer {
    private final int[] arr = new int[5];
    private int count = 0, in = 0, out = 0;

    // Producer adds an item
    public synchronized void produce(int value) throws InterruptedException {
        while (count == arr.length) { // buffer full
            wait();
        }
        arr[in] = value;
        in = (in + 1) % arr.length;
        count++;
        notify(); // notify consumer
    }

    // Consumer removes an item
    public synchronized int consume() throws InterruptedException {
        while (count == 0) { // buffer empty
            wait();
        }
        int value = arr[out];
        out = (out + 1) % arr.length;
        count--;
        notify(); // notify producer
        return value;
    }
}

class Producer extends Thread {
    private final Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 1; i <= 50; i++) {
                buffer.produce(i);
                System.out.println("Produced: " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 1; i <= 50; i++) {
                int value = buffer.consume();
                System.out.println("Consumed: " + value);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
