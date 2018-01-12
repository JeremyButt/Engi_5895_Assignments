package com.zephyr;
/**
 * Realization of AI interface using smart strategy [NOT IMPLEMENTED].
 *
 * STUDENTS: Nothing to change here.
 *
 * @author Andrew Vardy
 */

import java.lang.UnsupportedOperationException;

public class SmartAI implements AI {
    
    private char piece;
    
    /**
     * Construct a SmartAI.
     * 
     * @param aiIsX Indicates whether the AI player's piece is
     *              the 'X'.
     */
    public SmartAI(boolean aiIsX) {

        System.out.println("NERD!!");
        System.exit(1);
    }

    @Override
    public Move chooseMove(Board board) {
        throw new UnsupportedOperationException("Not implemented.");
    }
}
