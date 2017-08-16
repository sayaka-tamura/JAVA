/*
   Author : Sayaka Tamura
   File name: CircleDemo.java
   Result: 
 Enter an radius1: 10
 The circle's Area is 314.159
 The circle's diameter is 20.0
 The circle's Circumference is 62.8318
 Enter an radius2: 5
 The circle's Area is 78.53975
 The circle's diameter is 10.0
 The circle's Circumference is 31.4159

*/

import java.util.Scanner;

public class CircleDemo
{
   public static void main(String[] args)
   {  
      //Create Scanner Object
      Scanner keyboard = new Scanner(System.in);
      
      //Get radius1
		System.out.print("Enter an radius1: ");
		double radius1 = keyboard.nextDouble();
      
      //Create Circle Object
      Circle c = new Circle(radius1);
      
      System.out.println("The circle's Area is " + c.getArea());
      System.out.println("The circle's diameter is " + c.getDiameter());
      System.out.println("The circle's Circumference is " + c.getCircumference());

      //Get radius2
		System.out.print("Enter an radius2: ");
      
		double radius2 = keyboard.nextDouble();
      c.setCircle(radius2);
      
      System.out.println("The circle's Area is " + c.getArea());
      System.out.println("The circle's diameter is " + c.getDiameter());
      System.out.println("The circle's Circumference is " + c.getCircumference());
   }
}