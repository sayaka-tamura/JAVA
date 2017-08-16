/*
 * @author Sayaka Tamura
 * 2014/03/06
 */
 
import java.util.Scanner; 

public class TimeCulculator {
    
    public static void main(String[] args) {
         //Declare variables
               int seconds;
               double days;
        //Create scanner object
             Scanner keyboard = new Scanner(System.in);
        //Ask user for the number of seconds 
             System.out.println("Enter the number of seconds you'd like to translate to days ");
        //Accept the number
             seconds = keyboard.nextInt();

        //Calculate the number of hours in that many seconds.
             days = (double)seconds/86400;
        //Display the result
              if (days < 1) { 
              System.out.println("the number of seconds is less than a day."); 
              } else if (days >= 2) { 
              System.out.println("the number of seconds is " + days +" days."); 
              } else { 
              System.out.println("the number of seconds is " + days +" day."); 
              } 

    }
}