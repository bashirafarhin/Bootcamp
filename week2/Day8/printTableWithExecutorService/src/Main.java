import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TablePrinter {
    private boolean printTwo = true; // control flag

    public synchronized void printTable2() {
        for (int i = 1; i <= 10; i++) {
            while (!printTwo) { // wait if it's not Thread 1's turn
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("2 x " + i + " = " + (2 * i));
            printTwo = false; // give turn to Thread 4
            notify();
        }
    }

    public synchronized void printTable4() {
        for (int i = 1; i <= 10; i++) {
            while (printTwo) { // wait if it's not Thread 4's turn
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("4 x " + i + " = " + (4 * i));
            printTwo = true; // give turn back to Thread 2
            notify();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TablePrinter printer = new TablePrinter();

        // Create ExecutorService with 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(new Thread(new Runnable() {
            @Override
            public void run() {
                printer.printTable2();
            }
        }));

        executor.submit(new Thread(new Runnable() {
            @Override
            public void run() {
                printer.printTable4();
            }
        }));

        // Shutdown executor after tasks complete
        executor.shutdown();
    }
}
