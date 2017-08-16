/**
 * Created by Sayaka Tamura on 9/12/2016.
   File name: PassElements.java
   Result ex:
 5 10 15 20 25 30 35 40 
 5 10 15 20 25 30 35 40 
 5 10 15 20 25 30 35 40     
 */

public class PassElements{
   public static void main(String[] args){
      int[] numbers = {5, 10, 15, 20, 25, 30, 35, 40}; 
      
      //1.Enhanced loop to show the number in the array of "numbers" 
      for(int n: numbers)
      {
         System.out.print(n + " ");
      }
         System.out.println();
      
      //2.For loop to show the number in the array of "numbers"   
      for (int index = 0; index < numbers.length; index++)
      {
         //Method to show the number in the array of "numbers one by one
         showValue(numbers[index]);
      }
         System.out.println();
      
      //3.Method to show the number in the array of "numbers"
      showValue(numbers);
   
   }
   
   //Method for 2  
	public static void showValue(int n){
      System.out.print(n + " ");
   }
   
   //Method for 3
   public static void showValue(int[] n){
      for (int i=0; i<n.length; i++)
      {
         System.out.print(n[i] + " ");
      }
      
      System.out.println();   
   }
}
