/*
 * @author Sayaka Tamura
*/

import java.util.Scanner; 

public class MagicNumber {
    
    public static void main(String[] args) {
        //Declare variables
        int day;
        int month;
        int year;
        
        //Create a sccaner object
        Scanner keyboard = new Scanner(System.in);
        //Ask user for the day
        System.out.println("What's today's day");
        //Accept day from user
        day = keyboard.nextInt();
       
        //Ask user for the month
        System.out.println("What's today's month");
        //Accept day from user
        month = keyboard.nextInt();
        
        //Ask user for the year
        System.out.println("What's today's year");
        //Accept day from user
        year = keyboard.nextInt();
        
        if(day*month == year){
        	System.out.println("This is a magic number");
        }
        else{
        
        	System.out.println("This is not a magic number");
        }
    }
}