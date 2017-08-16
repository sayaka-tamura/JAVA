import java.util.Scanner;

/**
 * Created by Sayaka Tamura on 11/18/2016.
 */
public class areaDemo
{
	public static void main(String[]args)
	{
		double radius;
		double width;
		double length;
		double height;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the radius of the area");
		radius = keyboard.nextDouble();

		System.out.println("Enter the width of the area");
		width = keyboard.nextDouble();

		System.out.println("Enter the length of the area");
		length = keyboard.nextDouble();

		System.out.println("Enter the height of the area");
		height = keyboard.nextDouble();

		Area area1 = new Area(radius,width,length,height);
		Area area2 = new Area(5,20,12.8,3.7);

	}

}
