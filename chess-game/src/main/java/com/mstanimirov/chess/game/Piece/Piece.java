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
    
    public Piece(String name)
    {    
        this.piece_name = name;
    }
    
    /**
     * Getter, get piece name
     * @return piece name
     */
    public String getName(){
        return this.piece_name;    
    }
    
}
