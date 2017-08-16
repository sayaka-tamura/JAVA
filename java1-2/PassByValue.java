/*
   Author : Sayaka Tamura
   Purpose: learning how to use method
   Result:   
   number is 99
   I am changing the number.
   Now the value is 0
   number is 99
*/

public class PassByValue {
   public static void main(String[] args) {
   //Declare variables
      int number = 99; 
            
      System.out.println("number is " + number);
      
      changeMe(number);
      
      System.out.println("number is " + number);
            
   }
   
   public static void changeMe(int myValue) {
      System.out.println("I am changing the number.");
      
      myValue = 0;
      
      System.out.println("Now the value is " + myValue);
      
   }
  
}
