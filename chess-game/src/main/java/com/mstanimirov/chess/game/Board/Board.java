/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mstanimirov.chess.game.Board;

import com.mstanimirov.chess.game.Piece.Piece;

/**
 * Board Class
 * 
 * @author mstanimirov
 */
public class Board {
    
    private int width; // chessboard width
    private int height; // chessboard height
    private Piece[][] tiles; // 2d array to represent board tiles
    
    /**
     * Construct chessboard given width and height
     * 
     * Coordinate system
     *      
     * (1,1)------- +
     *     |
     *     |
     *     |
     *     +
     * 
     * @param width set the width of the chessboard
     * @param height set the height of the chessboard
     */
    public Board(int width, int height){
        
        //Set width and height of board
        this.width = width;
        this.height = height;
        
        //Initialize 2d array
        this.tiles = new Piece[height][width];
        
    }  
    
    /**
     * Getter, get chessboard width
     * @return width
     */
    public int getWidth(){
        return this.width;
    }
    
    /**
     * Getter, get chessboard height
     * @return height
     */
    public int getHeight(){
        return this.height;
    }
    
    /**
     * Getter, get piece at given coordinate. 
     * If there is no piece at that coordinate or coordinate is not valid return null.
     * @param x the x coordinate 
     * @param y the y coordinate
     * @return return pice at (x, y) coordinate. If coordinate not valid return null
     */
    public Piece getPiece(int x, int y){
        if(x >= this.width || x < 0 || y >= this.height || y < 0) // Index out of bound
            return null;
        return this.tiles[y][x];
    }
    
    /**
     * Setter, set piece at given (x, y) coordinate
     * @param p the piece to set
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public void setPiece(Piece p, int x, int y){
        this.tiles[x][y] = p;
    }
    
    /**
     * Remove piece from board
     * @param p the piece to remove
     */
    public void removePiece(Piece p){
        int x = p.getX_coordinate();
        int y = p.getY_coordinate();
        
        this.tiles[x][y] = null;
    }
    
}
