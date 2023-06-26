/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mstanimirov.chess.game.Piece;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;

/**
 * Coordinate class
 * 
 * Used to store possible moves coordinate value (x, y) of Piece
 * 
 * @author mstanimirov
 */
public class Coordinate {
    
    private int x;
    private int y;
    
    // Que used to store coordinates visited before reaching this coordinate
    public Queue<Coordinate> visited = new ArrayDeque<>();
    
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
    
    public String print(){
        return "(" + x +", "+ y +")";
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) 
            return true;
        if (o == null || getClass() != o.getClass()) 
            return false;
	
        Coordinate coord = (Coordinate) o;
        return x == coord.x && y == coord.y;	
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y);
    
    }
    
}
