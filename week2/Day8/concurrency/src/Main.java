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





class SharedBuffer {
    private final int[] buffer;
    private int count = 0, in = 0, out = 0;
    private final int SIZE;

    public SharedBuffer(int size) {
        this.SIZE = size;
        buffer = new int[SIZE];
    }

    // Producer puts an item in buffer
    public synchronized void produce(int item) throws InterruptedException {
        while (count == SIZE) {
            wait();  // buffer full, wait
        }
        buffer[in] = item;
        in = (in + 1) % SIZE;
        count++;
        notify(); // notify consumer
    }

    // Consumer takes an item from buffer
    public synchronized int consume() throws InterruptedException {
        while (count == 0) {
            wait(); // buffer empty, wait
        }
        int item = buffer[out];
        out = (out + 1) % SIZE;
        count--;
        notify(); // notify producer
        return item;
    }
}

// Producer Thread
class Producer extends Thread {
    private final SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 50; i++) {
                buffer.produce(i);
                System.out.println("Produced: " + i);
                Thread.sleep(1000); // optional, slows down production for demo
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Consumer Thread
class Consumer extends Thread {
    private final SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 50; i++) {
                int item = buffer.consume();
                System.out.println("Consumed: " + item);
                Thread.sleep(1000); // optional, slows down consumption
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



class Main {
    public static void main(String[] args) {

        SharedBuffer buffer = new SharedBuffer(5); // buffer size = 5
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();

    }
}