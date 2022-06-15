package chess;

import boardgame.Position;

public class ChessPosition {
	private char colomn;
	private int row;
	
	public ChessPosition(char colomn, int row) {
		if(colomn < 'a' || colomn > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.colomn = colomn;
		this.row = row;
	}

	public char getColomn() {
		return colomn;
	}

	public int getRow() {
		return row;
	}
	
	public Position toPosition() {
		return new Position(8 - row, colomn - 'a');
	}
	
	public ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a'-position.getColumn()), 8-position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + colomn + row;
	}
	
}
