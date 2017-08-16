import java.text.DecimalFormat;

/**
 * Write a class called Area that has three overloaded static methods
 * for calculating the areas of the following geometric shapes:
 Circles
 area= Pi*r2
 where Pi is Math.PI and r is the circle’s radius

 Rectangles
 area=width * length

 Cubes
 area=width * length * height
 Because the three methods are to be overloaded,
 they should each have the same name,
 but different parameter list.
 Demonstrate the class in a complete program.

 * Created by Sayaka Tamura on 11/18/2016.
 */
public class Area
{
	private static double radius;
	private static double width;
	private static double length;
	private static double height;

	private static double circle;
	private static double rectangles;
	private static double cubes;

	private DecimalFormat df;

	public Area(double r, double w, double len, double h)
	{
		df = new DecimalFormat("##,###.##");

		radius = r;
		width = w;
		length = len;
		height = h;

		calcurateArea();
	}

	public Area()
	{
		df = new DecimalFormat("##,###.##");

		radius = 0;
		width = 0;
		length = 0;
		height = 0;
	}

	public static void calCircle(double r)
	{
		circle = r*r*Math.PI;
	}

	public static void calRectangle(double w,double len)
	{
		rectangles = w*len;
	}

	public static void calCubes(double w,double len,double h)
	{
		cubes = w*len*h;
	}



	/*
	//Getter
	public static double getCircle() {
		return circle;
	}

	public static double getRectangles() {
		return rectangles;
	}

	public static double getCubes() {
		return cubes;
	}
	*/

	//Calculate Value
	public void calcurateArea()
	{
		calCircle(radius);
		calRectangle(width,length);
		calCubes(width,length,height);
		showAllValue();
	}

	//Show Value after calculate
	public void showAllValue()
	{
		System.out.println("Area for Circle is: " + df.format(circle) + " m^2");
		System.out.println("Area for Rectangle is: " + df.format(rectangles) + " m^2");
		System.out.println("Area for cube is: " + df.format(cubes) + " m^3");
	}
}
