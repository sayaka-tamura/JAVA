/**
 * Created by Sayaka Tamura on 10/20/2016.
 */
 
public class Point {

	private int x;
	private int y;


	public Point(int a, int b)
	{
		x=a;
		y=b;
	}

	//copy constructer (the parameter is special)
	public Point(Point p)
	{
		x=p.x;
		y=p.y;
	}

	public void setX(int a)
	{
		x=a;
	}

	public void setY(int a)
	{
		y=a;
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	public boolean equals(Point p)
	{
		if(x==p.x && y==p.y)
			return true;

		return false;
	}

	public Point clone()
	{
		return new Point(x,y);
	}

	public void showPoint()
	{
		System.out.println("("+x+"),"+y+")");
	}

	public String toString()
	{

		String str = "(";
		str +=x;
		str +=",";
		str +=y;
		str +=")";

		return str;

	}
}
