/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mstanimirov.chess.game;

import com.mstanimirov.chess.game.Board.Board;

/**
 *
 * @author mstanimirov
 */
public class ChessGame {

    public static void main(String[] args) {
        
        Board board = new Board(3,3);        
        board.drawBoard();
        
    }
}
