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
        while (true){
            int i = random.nextInt(3);
            int j = random.nextInt(3);
            if (this.aiIsX) {
                Move move = new Move(i,j,'X');
                if (board.isSpaceEmpty(move)){
                    return move;
                }
            } else {
                Move move = new Move(i,j,'O');
                if (board.isSpaceEmpty(move)){
                    return move;
                }
            }
        }
    }
}
