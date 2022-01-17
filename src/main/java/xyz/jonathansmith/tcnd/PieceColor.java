package xyz.jonathansmith.tcnd;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public enum PieceColor
{
	White(asList(
		new AlignedPiece(PieceType.Rook, 0, 0, PieceAlignment.QueenSide),
		new AlignedPiece(PieceType.Knight, 0, 1, PieceAlignment.QueenSide),
		new AlignedPiece(PieceType.Bishop, 0, 2, PieceAlignment.QueenSide),
		new Piece(PieceType.Queen, 0, 3),
		new Piece(PieceType.King, 0, 4),
		new AlignedPiece(PieceType.Bishop, 0, 5, PieceAlignment.KingSide),
		new AlignedPiece(PieceType.Knight, 0, 6, PieceAlignment.KingSide),
		new AlignedPiece(PieceType.Rook, 0, 7, PieceAlignment.KingSide),
		new Piece(PieceType.Pawn, 1, 0),
		new Piece(PieceType.Pawn, 1, 1),
		new Piece(PieceType.Pawn, 1, 2),
		new Piece(PieceType.Pawn, 1, 3),
		new Piece(PieceType.Pawn, 1, 4),
		new Piece(PieceType.Pawn, 1, 5),
		new Piece(PieceType.Pawn, 1, 6),
		new Piece(PieceType.Pawn, 1, 7))),
	Black(asList(
		new AlignedPiece(PieceType.Rook, 7, 0, PieceAlignment.KingSide),
		new AlignedPiece(PieceType.Knight, 7, 1, PieceAlignment.KingSide),
		new AlignedPiece(PieceType.Bishop, 7, 2, PieceAlignment.KingSide),
		new Piece(PieceType.King, 7, 3),
		new Piece(PieceType.Queen, 7, 4),
		new AlignedPiece(PieceType.Bishop, 7, 5, PieceAlignment.QueenSide),
		new AlignedPiece(PieceType.Knight, 7, 6, PieceAlignment.QueenSide),
		new AlignedPiece(PieceType.Rook, 7, 7, PieceAlignment.QueenSide),
		new Piece(PieceType.Pawn, 6, 0),
		new Piece(PieceType.Pawn, 6, 1),
		new Piece(PieceType.Pawn, 6, 2),
		new Piece(PieceType.Pawn, 6, 3),
		new Piece(PieceType.Pawn, 6, 4),
		new Piece(PieceType.Pawn, 6, 5),
		new Piece(PieceType.Pawn, 6, 6),
		new Piece(PieceType.Pawn, 6, 7)));
	
	private final List<Piece> startingPieces;
	
	private PieceColor(List<Piece> startingPieces)
	{
		this.startingPieces = startingPieces;
	}
	
	public List<Piece> getStartingPieces()
	{
		return new ArrayList(startingPieces);
	}
}
