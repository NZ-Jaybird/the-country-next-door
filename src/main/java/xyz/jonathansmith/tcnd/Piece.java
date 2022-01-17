package xyz.jonathansmith.tcnd;

public class Piece
{
	private final PieceType pieceType;
	private final int rank;
	private final int file;
	
	public Piece(final PieceType pieceType, final int rank, final int file)
	{
		this.pieceType = pieceType;
		this.rank = rank;
		this.file = file;
	}
	
	public PieceType getType() 
	{
		return pieceType;
	}
	
	public int getRank()
	{
		return rank;
	}
	
	public int getFile()
	{
		return file;
	}
}
