/*
   Author : Sayaka Tamura
   File name: FreezingBoilingPoints.java
   This makes constructor for a field and setter and getter
   Makes method for isEthylFreezing, isEthylBoiling, isOxygenFreezing
                    isOxygenBoiling, isWaterFreezing and isWaterBoiling
*/


public class FreezingBoilingPoints
{
   private double temperature;
   
   //No Args Constructor
   public FreezingBoilingPoints()
   {
      temperature = 0;
   }
   
   //Constructor
   public FreezingBoilingPoints(double tem)
   {
      temperature = tem;
   }
   
   //Set temperature Method
   public void setTemperature(double tem)
   {
      temperature = tem;
   }
   
   //Get Temperature method
   public double getTemperature()
   {
      return temperature;
   }
   
   //The isEthylFreezing method returns whether or not temperature is at or below freezing.   
   public boolean isEthylFreezing()
   {
      if (temperature <= -173)
         return true;
      else
         return false;
   }
   
   //The isEthylBoiling method returns whether or not temperature is at or above boiling.
   public boolean isEthylBoiling()
   {
      if(temperature >= 172)
         return true;
      else
         return false;
   }
   
   //The isOxygen nFreezing method returns whether or not temperature is at or below freezing.
   public boolean isOxygenFreezing()
   {
      if(temperature <= -362)
         return true;
      else
         return false;
   }
   
   //The isOxygenBoiling method returns whether or not temperature is at or above boiling.
   public boolean isOxygenBoiling()
   {
      if(temperature >= -306)
         return true;
      else
         return false;
   }
   
   //The isWaterFreezing method returns whether or not temperature is at or below freezing.
   public boolean isWaterFreezing()
   {
      if(temperature <= 32)
         return true;
      else
         return false;
   }
   
   //The isWaterBoiling method returns whether or not temperature is at or above boiling.
   public boolean isWaterBoiling()
   {
      if(temperature >= 212)
         return true;
      else
         return false;
   }
   
}
