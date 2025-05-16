package com.evenodd;

public class EvenOddThreadSleepDemo {

    public static void main(String[] args) {
        // Create a shared instance of NumberPrinter
        NumberPrinter printer = new NumberPrinter();

        // Create threads for odd and even printing
        Thread oddThread = new Thread(new OddNumberTask(printer), "Odd-Thread");
        Thread evenThread = new Thread(new EvenNumberTask(printer), "Even-Thread");

        // Start both threads
        oddThread.start();
        evenThread.start();
    }


}
