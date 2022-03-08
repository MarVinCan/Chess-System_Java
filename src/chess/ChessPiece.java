package chess;

import boardGame.Board;
import boardGame.Piece;
import boardGame.Position;

public abstract class ChessPiece extends Piece {
	
	private int moveCount;
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	public Color getColor() {
		return color;
	}
	public void increseMoveCount() {
		moveCount++;
	}
	public void decriseMoveCount() {
		moveCount--;
	}
	public int getMoveCount() {
		return moveCount;
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPositon(position);
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() !=color;
	}
}
