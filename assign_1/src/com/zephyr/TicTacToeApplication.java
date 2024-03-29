package com.zephyr;
/**
 * Contains the main method. Creates a ConsoleRunner and then calls its
 * mainLoop method.
 *
 * @author Jeremy Butt - 201527710
 *         Timothy Mather - 201527769
 */

public class TicTacToeApplication {

    public static void main(String[] args) {
        ConsoleRunner consoleRunner = new ConsoleRunner();
        consoleRunner.mainLoop();
    }
}
