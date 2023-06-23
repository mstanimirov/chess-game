/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mstanimirov.chess.game.Piece;

/**
 *
 * @author mstanimirov
 */
public class Piece {
    
    protected String piece_name; // Name of the piece
    
    protected int x_coordinate; // x coordinate of piece
    protected int y_coordinate; // y coordinate of piece
    
    public Piece(String name)
    {    
        this.piece_name = name; // set piece name
        
        this.x_coordinate = -1; // initial coordinate -1 (piece not on board)
        this.y_coordinate = -1;
        
    }
    
    /**
     * Getter, get piece name
     * @return piece name
     */
    public String getPiece_name(){
        return this.piece_name;    
    }
    
    /**
     * Getter, get x coordinate of piece
     * @return x coordinate
     */
    public int getX_coordinate(){
        return this.x_coordinate;
    }
    
    /**
     * Getter, get y coordinate of piece
     * @return y coordinate
     */
    public int getY_coordinate(){
        return this.y_coordinate;
    }
    
}
