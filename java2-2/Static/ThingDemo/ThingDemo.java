/**
 * Created by Sayaka Tamura on 11/18/2016.
   File name: ThingDemo.java
   Result ex:
    Now, x is 0, y is 0
    Now, x is 0, y is 0
    Now, x is 0, y is 0
    One: 0, 0, 7
    Two: 0, 0, 7
    One: 0, 0, 3
    Two: 0, 0, 3
    counter: 3
*/

public class ThingDemo
{
   public static void main(String[]args)
   {
      Thing one=new Thing();
      Thing two=new Thing();
      Thing three=new Thing();
      
      one.putThing(7);
      System.out.println("One: " + one.getX()+ ", " + one.getY()+ ", " + one.getZ());
      System.out.println("Two: " + two.getX()+ ", " + two.getY()+ ", " + two.getZ());
      
      two.putThing(3);
      System.out.println("One: " + one.getX()+ ", " + one.getY()+ ", " + one.getZ());
      System.out.println("Two: " + two.getX()+ ", " + two.getY()+ ", " + two.getZ());
      
      
      one.getNumOfInstances();      
   }
}