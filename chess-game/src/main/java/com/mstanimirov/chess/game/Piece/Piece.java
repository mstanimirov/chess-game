/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mstanimirov.chess.game.Piece;

import com.mstanimirov.chess.game.Board.Board;
import java.util.ArrayList;

/**
 * Piece Class
 * 
 * @author mstanimirov
 */
public abstract class Piece {
    
    protected String piece_name; // Name of the piece
    
    protected int x_coordinate; // x coordinate of piece
    protected int y_coordinate; // y coordinate of piece
    
    protected Board board; // current board object
    
    /**
     * Initialize a Piece object
     * @param name set the piece name
     */
    public Piece(String name, Board board)
    {    
        this.piece_name = name; // set piece name
        
        this.x_coordinate = -1; // initial coordinate -1 (piece not on board)
        this.y_coordinate = -1;
        
        this.board = board; // set the board
        
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
    
    /**
     * Set the coordinate of piece on board
     * @param x the x coordinate to put the piece
     * @param y the y coordinate to put the piece
     * @return if coordinate is valid return true; otherwise return false
     */
    public boolean setCoordinate(int x, int y){
        
        if(x >= this.board.getWidth() || x < 0 || y >= this.board.getHeight() || y < 0) // Index out of bound
            return false;
        
        if(x_coordinate != -1 && y_coordinate != -1){ // Piece is on board
            this.removeSelf(); // Remove self from current coordinte
        }
        
        // Set new coordinate
        this.x_coordinate = x;
        this.y_coordinate = y;
        
        // Update board
        this.board.setPiece(this, x, y);
        
        return true;
    }
    
    /**
     * Piece removes itself from board
     */
    public void removeSelf(){
        this.board.removePiece(this); // Remove piece from board
        this.x_coordinate = -1;
        this.y_coordinate = -1;
    }
    
    /**
     * 
     * Get all possible moves 
     * 
     * @return ArrayList<Coordinate> Object that contains all possible moves coordinates
     */
    public abstract ArrayList<Coordinate> getPossibleMoves();
    
}
