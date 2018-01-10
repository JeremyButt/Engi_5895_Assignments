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

    /*
     * TBD: Create additional private members if useful.
     */
    
    /**
     * Construct a DumbAI.
     * 
     * @param aiIsX Indicates whether the AI player's piece is
     *              the 'X'.
     */
    public DumbAI(boolean aiIsX) {
        /*
         * TBD
         */
    }

    public Move chooseMove(Board board) {
        /*
         * TBD
         */
        return null;
    }
}
