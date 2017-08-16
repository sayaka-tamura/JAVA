/**
 * Created by Sayaka Tamura on 10/20/2016.
   file name: PointDemo.java
   
   Result:
 p1: (10,5)
 p3: (10,5)
 p1: (100,5)
 p3: (100,5)
 p4: (100,5)
 p1: (100,5)
 p4: (1,5)
 p5: (100,5)
 p6: (100,5)
 p1: (100,5)
 p5: (10,5)
 p1: (100,5)
 p6: (20,5)
 (20,5)
 */
 
public class PointDemo {
	public static void main(String[] args)
	{
		Point p1 = new Point(3,5);
		Point p2 = new Point(5,3);

		Point p3 = p1; // assing of p1 to p3
						// p1 and p3 point to the same object.

		p1.setX(10);

		System.out.println("p1: " +p1);
		System.out.println("p3: " +p3);

		p3.setX(100);
		System.out.println("p1: " +p1);
		System.out.println("p3: " +p3);

		Point p4=p1.clone();
		System.out.println("p4: "+p4);

		p4.setX(1);
		System.out.println("p1: " +p1);
		System.out.println("p4: " +p4);

		Point p5 = new Point(p1.getX(),p1.getY());
		System.out.println("p5: " +p5);

		Point p6 = new Point(p1);
		System.out.println("p6: " +p6);

		p5.setX(10);
		System.out.println("p1: " +p1);
		System.out.println("p5: " +p5);

		p6.setX(20);
		System.out.println("p1: " +p1);
		System.out.println("p6: " +p6);

		System.out.println(p6.toString());
		//Or
		//System.out.println(p6);

		/*
		if(p1.equals(p2))
			System.out.println("They are the same")
		else
			System.out.println("They are different")

		//System.out.println(p.toString());
		//p.showPoint();
		*/
	}
}
