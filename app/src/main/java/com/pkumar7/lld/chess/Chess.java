package com.pkumar7.lld.chess;

import java.util.List;

public class Chess {
    ChessBoard chessBoard;
    Player playersA, playerB;
    Player currentPlayer;
    List<Move> moveList;
    GameStatus currentStatus;

    public boolean playerMove(CellPosition fromPosition, CellPosition toPosition, Piece piece){
        return false;
    }

    public boolean endGame(){
        return false;
    }

    private void changeTurn(){

    }
}
