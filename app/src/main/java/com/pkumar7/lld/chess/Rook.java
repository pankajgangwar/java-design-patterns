package com.pkumar7.lld.chess;

import java.util.List;

public class Rook extends Piece {

    @Override
    public boolean move(CellPosition fromPosition, CellPosition toPosition) {
        return false;
    }

    @Override
    public List<CellPosition> possibleMoves(CellPosition fromPosition) {
        return null;
    }

    @Override
    public boolean validate(CellPosition fromPosition, CellPosition toPosition) {
        return false;
    }
}
