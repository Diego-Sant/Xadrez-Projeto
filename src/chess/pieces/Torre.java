package chess.pieces;

import board.Board;
import chess.ChessPiece;
import chess.Color;

public class Torre extends ChessPiece {

	public Torre(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "♦";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}
	
}
