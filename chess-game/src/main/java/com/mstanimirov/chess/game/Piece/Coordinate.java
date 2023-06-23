/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mstanimirov.chess.game.Piece;

/**
 * Coordinate class
 * 
 * Used to store possible moves coordinate value (x, y) of Piece
 * @author mstanimirov
 */
public class Coordinate {
    
    private int x;
    private int y;
    
    /**
     * Set default coordinates to -1
     */
    public Coordinate(){
    
        this.x = -1;
        this.y = -1;
    
    }
    
    /**
     * Set x and y
     * @param x the x coordinate 
     * @param y the y coordinate
     */
    public Coordinate(int x, int y){
        this.x  = x;
        this.y = y;
    }
    
    /**
     * Getter, get x
     * @return the x coordinate
     */
    public int getX(){
        return this.x;
    }

    /**
     * Setter, set x
     * @param x set value
     */
    public void setX(int x){
        this.x = x;
    }

    /**
     * Getter, get y
     * @return the y coordinate
     */
    public int getY(){
        return this.y;
    }

    /**
     * Setter, set y
     * @param y set value
     */
    public void setY(int y){
        this.y = y;
    }
    
}
