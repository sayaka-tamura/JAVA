/*
   Author : Sayaka Tamura

   Result:   
   The sum is 11.4
*/

//the program demonstrates a method that accepts 2 arguments
public class TwoArgs {
   public static void main(String[] args) {
   //Declare variables
      double a = 4.5; 
      double b = 6.9;
            
      showSum(a,b);
                  
   }
   
   public static void showSum(double num1, double num2) {
      double sum;
      
      sum = num1 + num2;
      
      System.out.println("The sum is " + sum);
      
   }
  
}
