/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mstanimirov.chess.game.Piece;

import com.mstanimirov.chess.game.Board.Board;
import java.util.ArrayList;

/**
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

    @Override
    public ArrayList<Coordinate> getPossibleMoves() {
        
        ArrayList<Coordinate> coords = new ArrayList<>(); // Create return array list
        
        int[] x = {2, 1, -1, -2, -2, -1, 1, 2}; // Array with all possible x coordinates for this piece
        int[] y = {1, 2, 2, 1, -1, -2, -2, -1}; // Array with all possible y coordinates for this piece
        
        for(int i = 0; i < x.length; i++){
        
            // Inesrt check here
            coords.add(new Coordinate(x[i], y[i]));
        
        }
        
        return coords;
        
    }
    
}
