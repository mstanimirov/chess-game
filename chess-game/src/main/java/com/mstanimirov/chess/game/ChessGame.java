/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mstanimirov.chess.game;

import com.mstanimirov.chess.game.Board.Board;
import com.mstanimirov.chess.game.Piece.Knight;
import com.mstanimirov.chess.game.Piece.Piece;

/**
 *
 * @author mstanimirov
 */
public class ChessGame {
    
    public static void main(String[] args) {
        
        Board board = new Board(3,3);        
        Knight knight = new Knight(board);
        
        knight.setCoordinate(0, 0);
        drawBoard(board);
        
        knight.setCoordinate(2, 1);
        drawBoard(board);
        
    }
    
    /**
     * Print visual representation of the board and all pieces on it
     * @param board the board to draw
     */
    public static void drawBoard(Board board){
    
        int width = board.getWidth();
        int height = board.getHeight();
        
        //Draw top border
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
    
    }
    
}
