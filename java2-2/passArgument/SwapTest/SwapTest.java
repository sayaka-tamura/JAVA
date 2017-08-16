/**
 * Created by Sayaka Tamura on 11/17/2016.
   File name: SwapTest.java
   Result ex:
 From Swap: x=5	y=3
 Now, a=0 b=5
 a=3	b=5
 (8,0)
 (0,0)
 a=3	b=5
 */

import java.util.*;
public class SwapTest
{
   private static int b;
   
   public static void main(String[] args)
   {
       int a = 3;
       b = 5;
       //int b = 5;
       
       // pass by value : when a variable of a primitive data type
       // is passed to a method, only a copy of the variable is
       // passed, not the varaible iteself.

       swap(a, b);       
       changeToZero(a,b);
      
       
       System.out.println("At main method, a="+a+"\tb="+b);
       
       Point p=getAPoint();
       p.showPoint();
       
       //pass by reference
       changePointToZero(p);
       p.showPoint();
       
       System.out.println("a="+a+"\tb="+b);

   }
   
   public static void swap(int x, int y)
   {
      int temp = x;
      x = y;
      y = temp;
      System.out.println("From Swap: x="+x+"\ty="+y);
   }
   
   public static void changeToZero(int num,int num2)
   {
      num=0;
      System.out.println("Now, a="+num+" b="+ num2);
   }
   
   public static void changePointToZero(Point p)
   {
      p.setX(0);
      p.setY(0);
   }   

   public static Point getAPoint()
   {
      Random rand = new Random();
      //int x=rand.nextInt(10);
      //int y=rand.nextInt(10);
      //Point p = new Point(x,y );
      
      return new Point(rand.nextInt(10), rand.nextInt(10));
   
   }
 }