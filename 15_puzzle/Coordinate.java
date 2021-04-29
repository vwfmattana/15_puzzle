//777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777
//                              		 V.W.F Mattana 21128707
//777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777
//======================================================================================================
//                             				COORDINATES
//======================================================================================================
public class Coordinate
{
	//******************************************************************************************************
	//										DECLARATIONS
	//******************************************************************************************************
	int x;
	int y;
	
	public Coordinate()
	{
		x = -1;
		y = -1;
	}
	
	public Coordinate(int newX, int newY)
	{
		x = newX;
		y = newY;
	}
	
	public void setCoordinate(int newX, int newY)
	{
		x = newX;
		y = newY;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	
	public String toString()
	{
		return "("+x+", "+y+")";
	}
}// END OF Coordinates CLASS 