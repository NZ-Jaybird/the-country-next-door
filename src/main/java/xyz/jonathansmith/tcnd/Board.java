package xyz.jonathansmith.tcnd;

import java.lang.String;
import java.util.List;

public class Board
{
	private final Piece[][] grid = new Piece[8][8];
	private final Side white;
	private final Side black;
	
	public Board() 
	{
		white = new Side(PieceColor.White);
		addPieces(white.getPieces());
		
		black = new Side(PieceColor.Black);
		addPieces(black.getPieces());
	}
	
	private void addPieces(final List<Piece> pieces)
	{
		pieces.forEach(p -> grid[p.getRank()][p.getFile()] = p);
	}
	
	@Override
	public String toString()
	{
		final StringBuilder builder = new StringBuilder();
		for (int rank = 0; rank < 8; rank++)
		{
			for (int file = 0; file < 8; file++)
			{
				final Piece piece = grid[7 - rank][file];
				if (null == piece)
				{
					builder.append(" ");
				} 
				else 
				{
					builder.append(piece.getType());
				}
			}
			builder.append("\n");
		}
		return builder.toString();
	}
}
