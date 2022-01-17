package xyz.jonathansmith.tcnd;

import java.lang.String;

public enum PieceType 
{
	King,
	Queen,
	Bishop,
	Rook,
	Knight,
	Pawn;
	
	@Override
	public String toString()
	{
		if (this == Knight)
		{
			return "N";
		}
		else
		{
			return name().substring(0, 1);
		}
	}
}
