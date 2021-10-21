package com.pkumar7.lld.chess;

import java.util.List;

public abstract class Piece {
    Color color;
    public abstract boolean move(CellPosition fromPosition, CellPosition toPosition);
    public abstract List<CellPosition> possibleMoves(CellPosition fromPosition);
    public abstract boolean validate(CellPosition fromPosition, CellPosition toPosition);
}
