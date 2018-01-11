package com.zephyr;
/**
 * ConsoleRunner:  Prompts the user to determine the parameters of the Game
 * constructor.  Creates a Game and manages the alternating calls to the
 * ‘place’ methods in Game.  Prompts the user for inputs and outputs the state
 * of the board to the console.
 *
 * @author Jeremy Butt - 201527710
 *         Timothy Mather - 201527769
 */

import java.util.Scanner;

public class ConsoleRunner {

    /**
     * Should the human player be the X?  Note that X always
     * goes first.
     */
    private boolean playerIsX;

    private Game game;
    // Use to process text input from the user.
    private Scanner scanner = new Scanner(System.in);

    private boolean challenging;
    /*
     * TBD: Create additional private members if useful.
     */

    /**
     * Constructor
     */
    public ConsoleRunner() {
        this.gameStart();
        this.gameStart();
        this.game = new Game(this.playerIsX, this.challenging);
    }

    /**
     * Enter the main control loop which returns only at the end of the game
     * when one party has won or there has been a draw.
     */
    public void mainLoop() {
        /*
         * TBD
         *
         * Use the 'nextInt' method of Scanner class to read user responses as
         * integers.
         *
         * There is enough work to do here that you may want to introduce
         * private methods (i.e. helper methods).
         *
         *
         */
    }

    public void gameStart() {
        boolean valid = false;
        while (!valid) {

            System.out.println("Do you want to be X? (Y/N)\n");
            String response = this.scanner.next();
            if (response.matches("Y") || response.matches("y")) {
                this.playerIsX = true;
                valid = true;
            } else if (response.matches("N") || response.matches("n")) {
                this.playerIsX = false;
                valid = true;
            } else {
                System.out.println("Not a valid selection, please try again.");
            }


            System.out.println("Do you want a challenge? (Y/N)");
            response = this.scanner.next();
            if (response.matches("Y") || response.matches("y")) {
                this.challenging = true;
                valid = true;
            } else if (response.matches("N") || response.matches("n")) {
                this.challenging = false;
                valid = true;
            } else {
                System.out.println("Not a valid selection, please try again.");
            }


        }

    }
}
