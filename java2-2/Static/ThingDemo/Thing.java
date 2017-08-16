/**
 * Created by Sayaka Tamura on 11/18/2016.
   File name: Thing.java
*/


public class Thing
{
   private int x;
   private int y;
   private static int z=0;
   private static int counter=0;
   
   public Thing()
   {
   	x=z;
   	y=z;
      
      counter++;
      System.out.println("Now, x is " + x + ", y is "+ y);
   }
   
   public Thing(int x,int y)
   {
      x=z;
   	y=z;
   }

   public static void putThing(int a)
   {
   	z=a;
   }
   
   //Setter
   public void setX(int x)
   {
      x=z;
   }
   
   public void setY(int y)
   {
      y=z;
   }
   
   //Getter
   public int getX()
   {
      return x;
   }
   
   public int getY()
   {
      return y;
   }
   
   public int getZ()
   {
      return z;
   }
   
   public static void getNumOfInstances()
   {
      System.out.println("counter: " +counter);
   }
}