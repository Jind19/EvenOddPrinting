package com.evenodd;

/**
 * This class represents the task that will be run on a separate thread to print even numbers.
 */
public class EvenNumberTask implements Runnable{

    private final NumberPrinter printer; // Reference to the shared NumberPrinter

    public EvenNumberTask(NumberPrinter printer) {
        this.printer = printer;
    }

    // Run method executed by the thread
    @Override
    public void run() {
        printer.printEven();
    }
}
