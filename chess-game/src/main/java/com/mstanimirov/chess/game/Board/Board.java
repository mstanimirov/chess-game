/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mstanimirov.chess.game.Board;

/**
 *
 * @author mstanimirov
 */
public class Board {
    
    int width;
    int height;
    Tile[][] tiles;
        
    /**
     * Construct chessboard given width and height
     * @param width set the width of the chessboard
     * @param height set the height of the chessboard
     */
    public Board(int width, int height){
        
        //Set width and height of board
        this.width = width;
        this.height = height;
        
        //Initialize 2d array to store tiles
        this.tiles = new Tile[height][];
        for(int i = 0; i < height; i++){
            this.tiles[i] = new Tile[width];
        }
        
    }  
    
    /**
     * Print the board
     */
    public void drawBoard(){
        
        //Draw top border
        for(int i = 0; i < width; i++)
            System.out.print(".---");
        
        System.out.print(".");
        
        for(int i = 0; i < width; i++){
            
            System.out.print("\n");
            
            //Draw boxes
            for(int j = 0; j < height; j++){
                
                String p = tiles[i][j].hasPiece() ? tiles[i][j].getPiece().getName() : " ";
                System.out.print("| " + p +" ");
            
            }                
            
            System.out.print("|\n");
            
            //Draw bottom border
            for(int l = 0; l < width; l++)
                System.out.print(".---");
        
            System.out.print(".");
            
        }      
                
    }
    
    /**
     * 
     * Return the tile at given coordinate
     * if there is no tile at that coordinate, or that coordinate is invalid, return null
     * @param x the x coordinate
     * @param y the y coordinate
     * @return  the piece at (x, y) coordinate. If coordinate not valid, return null.
     */
    public Tile getTile(int x, int y){
        
        if(x >= this.width || x < 0 || y >= this.height || y < 0) //Index out of bound
            return null;
        
        return tiles[x][y];
        
    }
    
}
