/*
   Author : Sayaka Tamura

   Purpose: Convert user-input(meters) to  
            km,inches or feet

   Result ex: 
      Enter a distance in meters: 
      10
      1. Convert to kilometers 
      2. Convert to inches 
      3. Convert to feet 
      4. Quit the program 
      Enter your choice: 
      1
      10.0 meters is 0.01 kilometers.
      Enter your choice: 
      4
      Bye!
*/


import java.util.Scanner;

class ConversionProgram
{      
      public static void main(String[] args)
      {
         double meters;
         int choice;
         
         Scanner keyboard = new Scanner(System.in);
         System.out.println("Enter a distance in meters: ");
         meters = keyboard.nextDouble();
         menu();
         do{
            System.out.println("Enter your choice: ");
            choice = keyboard.nextInt();
            
            switch (choice)
            {
               case 1: showKilometers(meters);
               break;
               case 2: showInches(meters);
               break;
               case 3: showFeet(meters);
               break;
               case 4: quitProgram();
            }
         }while(!(choice==4));
      }
      
      public static void menu()
      {
         System.out.println("1. Convert to kilometers ");
         System.out.println("2. Convert to inches ");
         System.out.println("3. Convert to feet ");
         System.out.println("4. Quit the program ");
      }
      
      public static void showKilometers(double meters)
      {
         double kilometers = meters * 0.001;
         System.out.println(meters + " meters is " + kilometers + " kilometers.");
      }
      
      public static void showInches(double meters)
      {
         double inches = meters * 39.37;
         System.out.println(meters + " meters is " + inches + " inches.");
      }
      
      public static void showFeet(double meters)
      {
         double feet = meters * 3.281;
         System.out.println(meters + " meters is " + feet + " feet.");
      }
      
      public static void quitProgram()
      {
         System.out.println("Bye!");
      }
}