/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mstanimirov.chess.game;

import com.mstanimirov.chess.game.Board.Board;
import com.mstanimirov.chess.game.Piece.Coordinate;
import com.mstanimirov.chess.game.Piece.Knight;
import com.mstanimirov.chess.game.Piece.Piece;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

/**
 * Chess Game class
 * 
 * @author mstanimirov
 */
public class ChessGame {
    
    private static Board board;
    private static int boardWidth = 3;
    private static int boardHeight = 3;
    
    private static int[][] boardTiles; // 2d array to store visited tiles
    
    public static void main(String[] args) {
        
        // Set the board
        board = new Board(boardWidth,boardHeight);
        
        // Initialize 2d array to store visited tiles
        boardTiles = new int[board.getWidth()][board.getHeight()];
        
        // Knight start position input
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        
        // Put Knight on board
        Knight knight = new Knight(board);        
        knight.setCoordinate(x, y);
        
        // Set target to far right hand bottom corner.
        Coordinate target = new Coordinate(boardWidth - 1, boardHeight - 1);
        
        // Move knight to target
        drawBoard(board);
        if(moveToTarget(knight, target))
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
        
        int x = Math.abs(p.getX_coordinate() - target.getX());//p.getX_coordinate();
        int y = Math.abs(p.getY_coordinate() - target.getY());//p.getY_coordinate();
        
        if(x * y == 2){ // Can be solved in one move
            
            p.setCoordinate(target.getX(), target.getY());
            drawBoard(board);

            return true;
            
        }
        
        Queue<Coordinate> path = findShortestPath(p, target);        
        if(path != null){
            
            while(!path.isEmpty()){
                
                Coordinate coord = path.poll();
                p.setCoordinate(coord.getX(), coord.getY());
                drawBoard(board);
                
            }
            
            return true;
            
        }
        
        return false;
        
    }

    public static Queue<Coordinate> findShortestPath(Piece p, Coordinate target){
        
        // Store visited coordinates
        Set<Coordinate> visited = new HashSet<>();
        
        // Create queue and enqueue the first coordinate
        Queue<Coordinate> q = new ArrayDeque<Coordinate>();
        q.add(new Coordinate(p.getX_coordinate(), p.getY_coordinate()));
        
        // Loop till queue is empty
        while(!q.isEmpty()){
             
            // Dequeue front coordinate and process it
            Coordinate coord = q.poll();
            
            int x = coord.getX();
            int y = coord.getY();
            
            // 
            if(x == target.getX() && y == target.getY()){     
                coord.visited.add(coord);
                return coord.visited;
            }
            
            if(!visited.contains(coord)){
                
                visited.add(coord);
                coord.visited.add(coord);
                
                ArrayList<Coordinate> coords = p.getPossibleMoves(coord.getX(), coord.getY());
                
                // Go through all possible move coordinates
                for( Coordinate c : coords){
                                        
                    if(p.isValidCoordinate(c.getX(), c.getY())){
                        c.visited.addAll(coord.visited);
                        q.add(c);
                    }
                    
                }
                
            }
            
        }
        
        return null;
        
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
