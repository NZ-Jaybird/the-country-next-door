package xyz.jonathansmith.tcnd;

public class AlignedPiece extends Piece
{
	private final PieceAlignment pieceAlignment;
	
	public AlignedPiece(final PieceType pieceType, final int rank, final int file, final PieceAlignment pieceAlignment)
	{
		super(pieceType, rank, file);
		this.pieceAlignment = pieceAlignment;
	}
}
