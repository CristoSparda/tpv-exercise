package oop.inheritance.core;

public interface DisplayInterface {
    /**
     * Prints a message to specied position
     *
     * @param x       horizontal position
     * @param y       vertical position
     * @param message message to be printed
     */
    void  showMessage(int x, int y, String message);

    /**
     * Clears the screen
     */
    void clear();
}
