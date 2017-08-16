/**
 * Created by Sayaka Tamura on 9/12/2016.
   File name: ArraySumAveLargeSmall.java
   Result ex:
 3 90 -23 4 8 98 100 
 The sum of the values is 280
 The Avg of the values is 40.0
 The largest is 100
 The smallest is -23
*/

public class ArraySumAveLargeSmall
{
   public static void main(String[] args)
   {
      int[] numbers = {3, 90, -23, 4, 8, 98, 100};
     // System.out.println(numbers[-3]);  
     
     //display the array
     for(int i=0; i<numbers.length; i++)
     {
       System.out.print(numbers[i]+" ");
     }
     
     System.out.println(); 
   
     // get the total of the array
     
     int sum=0;
     for(int i=0; i<numbers.length; i++)
     {
        sum+=numbers[i];
     }
     System.out.println("The sum of the values is "+sum);
     System.out.println("The Avg of the values is "+(double)sum/numbers.length);
     
     //find the largest element of the array
     
     int a=0;
     for(int i=0; i<numbers.length; i++)
     {
        for(int j=i; j<numbers.length;j++)
        {
           if(numbers[i]<numbers[j])
           {
              a=numbers[i];
              numbers[i]=numbers[j];
              numbers[j]=a;
           }
        }
     }
     System.out.println("The largest is " + numbers[0]);
     System.out.println("The smallest is " + numbers[numbers.length-1]);

     
     
     
     
     
     /*
     
      3 2 5 8 7
      max = 3
      if(2>max) no   
      if(5>max) yes  max=5
      if(8>max) yes  max=8
      if(7>max) no  
      
     
     
     */
     
   }
}