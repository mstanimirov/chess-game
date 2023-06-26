/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mstanimirov.chess.game;

import com.mstanimirov.chess.game.Board.Board;
import com.mstanimirov.chess.game.Piece.Coordinate;
import com.mstanimirov.chess.game.Piece.Knight;
import com.mstanimirov.chess.game.Piece.Piece;
import java.util.ArrayList;

/**
 * Chess Game class
 * 
 * @author mstanimirov
 */
public class ChessGame {
    
    private static Board board;
    private static int[][] boardTiles; // 2d array to store visited tiles
    
    public static void main(String[] args) {
        
        //Set the board
        board = new Board(4,4);
        
        //Initialize 2d array to store visited tiles
        boardTiles = new int[board.getWidth()][board.getHeight()];
        
        //Put Knight on board
        Knight knight = new Knight(board);        
        knight.setCoordinate(0, 0);
        
        //Draw the board and move knight to target
        if(moveToTarget(knight, new Coordinate(3, 3)))
            System.out.print("\n[X] Target Reached!");
        else
            System.out.print("\n[X] Target can't be reached with this setup!");
        
    }
    
    /**
     * 
     * Move piece to target coordinates
     * 
     * Go through all possible moves until target is reached
     * without visiting same coordinate twice (results infinite loop)
     * 
     * @param p piece to move
     * @param target coordinates to move piece to
     * @return true if target is is reached
     */
    public static boolean moveToTarget(Piece p, Coordinate target){
        
        int x = p.getX_coordinate();
        int y = p.getY_coordinate();
        ArrayList<Coordinate> coords = p.getPossibleMoves();
        
        if(x == target.getX() && y == target.getY()) // Target reached
            return true;
        
        // Go through all possible move coordinates
        for( Coordinate c : coords){
            
            if(boardTiles[c.getX()][c.getY()] == 1) // Tile already visited
                continue;
            
            if(p.setCoordinate(c.getX(), c.getY())){
                
                boardTiles[x][y] = 1; // Mark visited tile             
                                
                if(moveToTarget(p, target)) // Recursively call for the next move
                    return true;
                else
                    p.setCoordinate(x, y); // Return tile to initial coordinates
                
            }                     
            
        }
        
        return false;
        
    }
    
    /**
     * Print visual representation of the board and all pieces on it
     * @param board the board to draw
     */
    public static void drawBoard(Board board){
    
        int width = board.getWidth();
        int height = board.getHeight();
        
        //Draw top border
        System.out.println();
        for(int i = 0; i < width; i++)
            System.out.print(".---");
        
        System.out.print(".");
        
        for(int i = 0; i < width; i++){
            
            System.out.print("\n");
            
            //Draw boxes
            for(int j = 0; j < height; j++){
                
                Piece p = board.getPiece(i, j);
                
                if(p != null)                    
                    System.out.print("| " + p.getPiece_name() +" ");
                else
                    System.out.print("|   ");
            
            }                
            
            System.out.print("|\n");
            
            //Draw bottom border
            for(int l = 0; l < width; l++)
                System.out.print(".---");
        
            System.out.print(".");
            
        }
        
        System.out.println();
        
    }
    
}
