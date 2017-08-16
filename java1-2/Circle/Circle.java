/*
   Author : Sayaka Tamura
   File name: Circle.java
   This makes constructor for radius and setter
   Makes getter for getArea, getDiameter and getCircumference
*/

public class Circle
{
   private double radius;
   private final double PI = 3.14159;
   
   //No Args Constructor
   public Circle()
   {
      radius = 0;
   }
   
   //Constructor
   public Circle(double r)
   {
      radius = r;
   }
   
   //Setter
   public void setCircle(double r)
   {
      radius = r;
   }
   
   //getter
   public double getArea()
   {
      return PI*radius*radius;
   }
   
   public double getDiameter()
   {
      return radius*2;
   }
   
   public double getCircumference()
   {
      return 2*PI*radius;
   }


}