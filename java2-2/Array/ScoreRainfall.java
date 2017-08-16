/**
 * Created by Sayaka Tamura on 9/12/2016.
   File name: ScoreRainfall.java
   Result ex:
    Scores: 98.5 69.5 89.0 76.0 88.0 
    Rainfall: 2.5 9.5 0.89 0.76 1.88 3.2 1.23 
    The highest score is 98.5
    temp: [D@6d06d69c
    The average of the array is 84.2   
 */


import java.util.*;

public class ScoreRainfall
{
   public static void main(String[] args)
   {
      double[] scores = {98.5, 69.5, 89, 76, 88};      
      double[] rainfall = {2.5, 9.5, 0.89, 0.76, 1.88, 3.2, 1.23};
     
      System.out.print("Scores: ");
      displayArray(scores);  // pass the array name only as the argument 
      
      System.out.print("Rainfall: ");
      displayArray(rainfall);

     System.out.println("The highest score is "+ findLargest(scores));
     
     double[] temp = getArray(30);
     
     System.out.print("temp: ");
     
     System.out.println(temp);
     
     double ave= getAverage(scores);
     System.out.println("The average of the array is "+ave);
   }
   
   /**
    Display an array of double floating point numbers.
    @param array
    */
      
   public static void displayArray(double[] array)
   {
      for(double a: array)
       System.out.print(a+ " ");
      System.out.println();
   }
   
   /**
    find the largets element of the array
    @param array
    @return largest element
   */
   public static double findLargest(double[] array)
   {
      double max = array[0];
      /*
         for (double x : array)
            if (max < x)
               max = x;
     */
     for(int i=1; i<array.length; i++)
      if (max < array[i])
               max = array[i];
     
      return max;
  
   }
   
   /**
      Generate an array of random floating point numbers
      @param size the number of random numbers
      @return an array of  random floating point numbers
   */
   public static double[] getArray(int size)
   {
      Random rand = new Random();
      double[] array = new double[size];
      
      for(int i=0; i<array.length; i++)
      {
         array[i]=rand.nextDouble();
      }
      
      return array;  // only the name of array should be here.
   }
   
   /**
     get the average of an array
     
   */
   public static double getAverage(double[] array)
   {
      double sum=0;
    
      for(int i=0;i<array.length;i++)
          sum+=array[i];
      
      return sum/array.length;
    } 
   
 }