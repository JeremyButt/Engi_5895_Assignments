package com.zephyr;
/**
 * Realization of AI interface using simplistic random placement strategy.
 *
 * @author Jeremy Butt - 201527710
 *         Timothy Mather - 201527769
 */

import java.util.Random;

public class DumbAI implements AI {
    
    private Random random = new Random();
    private boolean aiIsX;
    
    /**
     * Construct a DumbAI.
     * 
     * @param aiIsX Indicates whether the AI player's piece is
     *              the 'X'.
     */
    public DumbAI(boolean aiIsX) {
        this.aiIsX = aiIsX;
    }

    public Move chooseMove(Board board) {
        boolean empty = false;
        int i=0;
        int j=0;
        while (!empty) {
            i = random.nextInt(3);
            j = random.nextInt(3);
            empty = board.get(i, j)==' ';
        }
        Move move;
        if (this.aiIsX) {
            move = new Move(i,j,'X');
            return move;
        }

        else {
            move = new Move(i,j,'O');
            return move;
        }
    }
}
