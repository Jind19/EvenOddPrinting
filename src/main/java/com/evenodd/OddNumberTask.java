package com.evenodd;

/**
 * This class represents the task that will be run on a separate thread to print odd numbers.
 */
public class OddNumberTask implements Runnable{

    private final NumberPrinter printer; // Reference to the shared NumberPrinter

    public OddNumberTask(NumberPrinter printer) {
        this.printer = printer;
    }

    // Run method executed by the thread
    @Override
    public void run() {
        printer.printOdd();
    }
}
