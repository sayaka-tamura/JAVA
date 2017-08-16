/*
   Author : Sayaka Tamura
   File name: FreezingBoilingPointsDemo.java
   Result ex:
 What is the the temperature?20
 Oxygen will boil
 Water will freeze
*/


import java.util.Scanner; //imports scanner class

public class FreezingBoilingPointsDemo
{
   public static void main (String[] args)
   {  
      //Create Scanner Object      
      Scanner keyboard = new Scanner(System.in);
      
      //Ask temperature
      System.out.print("What is the the temperature?");
           
      double temperature= keyboard.nextDouble();
      
      
      FreezingBoilingPoints substance1 = new FreezingBoilingPoints(temperature);
      //Ethyl
      if(substance1.isEthylFreezing())
      {
         System.out.println("Ethyl alcohol will freeze");
      }
      
      if(substance1.isEthylBoiling())
      {
         System.out.println("Ethyl alcohol will boil");
      }
      
      //Oxygen
      if(substance1.isOxygenFreezing())
      {
         System.out.println("Oxygen will freeze");
      }
      
      if(substance1.isOxygenBoiling())
      {
         System.out.println("Oxygen will boil");
      }
      
      //Water
      if(substance1.isWaterFreezing())
      {
         System.out.println("Water will freeze");
      }
            
      if(substance1.isWaterBoiling())
      {
         System.out.println("Water  will Boil");
      }
      
   } 
}  

