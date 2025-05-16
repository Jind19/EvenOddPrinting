package com.evenodd;

// This class handle printing numbers from 1 to 20.
public class NumberPrinter {

    private int number = 1;      //this will be incremented as numbers are printed.
    private static final int MAX = 20;  // this defines the upper limit of the range we want to print.

    public void printOdd(){
        // Loop until number exceeds the maximum limit
        while (number <= MAX){
            if(number %2 != 0){
                System.out.println("Odd: " + number);
                number++; // Increment after printing
            }

            // Pause the thread for 100ms
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // Restore the interrupted status and print error
                Thread.currentThread().interrupt();
                System.err.println("Odd thread interrupted.");
            }

        }
    }

    public void printEven() {
        while (number <= MAX) {
            if (number % 2 == 0) {
                System.out.println("Even: " + number);
                number++; // Increment after printing
            }

            // Pause the thread for 100ms
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Even thread interrupted.");
            }
        }
    }
}

