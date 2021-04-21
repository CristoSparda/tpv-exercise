package oop.inheritance.core;

public interface PrinterInterface {
    /**
     * Prints a message on the current line at the specified horizontal position
     *
     * @param x       horizontal offset
     * @param message Message to be printed
     */
    void print(int x, String message);

    /**
     * Add a line break to the paper
     */
    void lineFeed();
}
