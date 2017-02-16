
public class Area {
	int length,breadth;
	Area(int x,int y)
	{
		length = x;
		breadth = y;
	}
	Area(int x)
	{
		length = breadth = x;
	}
	float getArea()
	{
		return length*breadth;
	}
}
