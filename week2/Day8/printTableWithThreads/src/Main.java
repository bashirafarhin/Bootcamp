class TablePrinter {
    private boolean printTwo = true; // control flag

    public synchronized void printTable2() {
        for (int i = 1; i <= 10; i++) {
            while (!printTwo) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("2 x " + i + " = " + (2 * i));
            printTwo = false;
            notify();
        }
    }

    public synchronized void printTable4() {
        for (int i = 1; i <= 10; i++) {
            while (printTwo) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("4 x " + i + " = " + (4 * i));
            printTwo = true;
            notify();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TablePrinter printer = new TablePrinter();


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                printer.printTable2();
            }
        });


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                printer.printTable4();
            }
        });


        t1.start();
        t2.start();
    }
}

//TablePrinter class controls the printing.
//printTwo boolean flag ensures alternating turns:
//true → Thread 1 (table of 2) prints
//false → Thread 2 (table of 4) prints
//wait() pauses a thread until notified.
//notify() wakes up the waiting thread.
//Each thread loops from 1 to 10, printing its table one by one in order.
