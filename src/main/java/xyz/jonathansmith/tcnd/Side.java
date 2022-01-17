package xyz.jonathansmith.tcnd;

import java.util.ArrayList;
import java.util.List;

public class Side
{
	private final PieceColor pieceColor;
	private final List<Piece> pieces;
	
	private boolean hasKingMoved = false;
	private boolean hasKingSideRookMovedOrBeenTaken = false;
	private boolean hasQueenSideRookMovedOrBeenTaken = false;
	private boolean isKingSideCastlePossible = false;
	private boolean isQueenSideCastlePossible = false;
	private boolean isInCheck = false;
	
	public Side(final PieceColor pieceColor)
	{
		this.pieceColor = pieceColor;
		pieces = pieceColor.getStartingPieces();
	}
	
	public List<Piece> getPieces()
	{
		return pieces;
	}
}
