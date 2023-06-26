/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mstanimirov.chess.game.Piece;

import com.mstanimirov.chess.game.Board.Board;
import java.util.ArrayList;

/**
 * Knight Class
 * 
 * @author mstanimirov
 */
public class Knight extends Piece{
    
    /**
     * Initialize a Knight object
     */
    public Knight(Board board) {
        super("K", board);
    }

    /**
     * Get all possible move coordinates for this knight piece at current coordinate
     *
     *        @     @    
     *     @           X    P: this piece 
     *           P          X: start
     *     @           @    @: possible move coordinate
     *        @     @    
     * 
     * @return ArrayList<Coordinate> Object that contains all possible move coordinates
     */
    @Override
    public ArrayList<Coordinate> getPossibleMoves() {
        
        ArrayList<Coordinate> coords = new ArrayList<>(); // Create return array list
        
        int[] x = { 2, 2, 1,-1, -2, -2, -1, 1}; // Array with all possible x coordinates for this piece
        int[] y = {-1, 1, 2, 2,  1, -1, -2,-2}; // Array with all possible y coordinates for this piece
        
        for(int i = 0; i < x.length; i++){
        
            addMoveIfValid(coords, this.x_coordinate + x[i], this.y_coordinate + y[i]);
        
        }
        
        return coords;
        
    }
    
}
