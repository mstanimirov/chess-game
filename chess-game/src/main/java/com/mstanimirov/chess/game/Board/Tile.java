/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mstanimirov.chess.game.Board;

import com.mstanimirov.chess.game.Piece.Piece;

/**
 *
 * @author mstanimirov
 */
public class Tile {
    
    private int x;
    private int y;
    private Piece piece;

    /**
     *
     * Initialize a Tile object with Piece on it
     * @param x the x coordinate on board
     * @param y the y coordinate on board
     * @param piece the Piece to put on tile
     */
    public Tile(int x, int y, Piece piece){
    
        this.x = x;
        this.y = y;
        this.piece = piece;
    
    }

    /**
     * Check whether there's a Piece on this tile
     * @return
     */
    public boolean hasPiece(){
        return piece != null;        
    }
    
    /**
     * Getter, return the x coordinate of this tile
     * @return the x coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Getter, return the y coordinate of this tile
     * @return the y coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Getter, return the piece on this tile
     * @return piece
     */
    public Piece getPiece(){
        return this.piece;
    }
    
    /**
     * Setter, set the piece on this tile
     * @param piece piece
     */
    public void setPiece(Piece piece) {
        this.piece = piece;
    }
    
}
