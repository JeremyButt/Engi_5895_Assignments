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

        while(this.game.getStatus() == GameStatus.IN_PROGRESS) {
            if (playerIsX){
                getAndMakePlayerMove();
            }else
                getAndMakeAIMove();

            if(this.game.getStatus() != GameStatus.IN_PROGRESS)
                break;

            printBoardAndGameStatus();

            if(playerIsX)
                getAndMakeAIMove();
            else{
                getAndMakePlayerMove();
            }

            if(this.game.getStatus() != GameStatus.IN_PROGRESS)
                break;

            printBoardAndGameStatus();
        }
        congratulateWinner();
        printBoardAndGameStatus();
    }

    private void printBreak(){
        System.out.print("-------------------------------------------------------\n");
    }

    private void printBoardAndGameStatus(){
        String gameStatus = this.game.getStatus()==GameStatus.IN_PROGRESS?"IN PROGRESS":"COMPLETED";
        printBreak();
        System.out.print("The Game is currently " + gameStatus + " !\n");
        System.out.print(this.game.getBoard().toString());
        printBreak();
    }

    private void congratulateWinner(){
        String winner = "";
        if(this.game.getStatus()==GameStatus.X_WON)
            winner = "Congratulations X!! :) ";
        else if(this.game.getStatus()==GameStatus.O_WON)
            winner = "Congratulations O!! :) ";
        else if(this.game.getStatus()==GameStatus.DRAW)
            winner = "This was a DRAW!! Good Work!! ";

        System.out.print("#######################################\n");
        System.out.print(winner + "\n");
        System.out.print("#######################################\n");
    }

    private void getAndMakePlayerMove(){
        boolean validMove = false;
        while(!validMove) {
            char playerPiece = this.playerIsX ? 'X' : 'O';
            System.out.print("Where would you like to place your " + playerPiece + " piece?\n");
            printCoordinates();
            System.out.print("'X' Coordinate first.\n");
            int i = this.scanner.nextInt();

            System.out.print("'Y' Coordinate next.\n");
            int j = this.scanner.nextInt();

            validMove = this.game.placePlayerPiece(i, j);
            if(!validMove)
                System.out.print("This is not a valid position.\n");
        }
    }

    private void getAndMakeAIMove(){
        this.game.aiPlacePiece();
        System.out.print("AI Move Made \n");
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
        }
        valid  = false;
        while(!valid) {
            System.out.println("Do you want a challenge? (Y/N)");
            String response = this.scanner.next();
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
        printBreak();
    }
    public void printCoordinates(){
        System.out.println("00|01|12\n---------\n10|11|12\n---------\n20|21|22");
    }

}
