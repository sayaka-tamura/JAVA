/**
 *
 * @author Sayaka Tamura 
 * @version 1.00 14/03/20
 */
 
//Needed import Scannner Class
import java.util.Scanner;

public class DistanceTraveled {
    
    public static void main(String[] args) {
        //Declare Variable
        double speed;
        double totalPeriod;
        double distance;
        
        //Create Scanner Object
        Scanner keyboard  = new Scanner(System.in);
        // 
        do
        {
        	//Ask User the speed of a vehicle in miles-per-hour
        	System.out.println("Enter the speed of a vehicle in miles-per-hour.");
        	System.out.println("Don't type any nagative number");
        	//Accept the number
        	speed = keyboard.nextDouble();
        }
        while(speed<0);//Check the condition, it's (speed>0) or not
        
        do
        {
	        //Ask User the number of hours it has traveled.
	        System.out.println("Enter the number of hours it has traveled.");
	        System.out.println("Don't type any value less than 1 for time traveled.");
	        //Accept the number
	        totalPeriod = keyboard.nextDouble();
	    }
        while(totalPeriod<1);//Check the condition, it's (hours>=1) or not
        
        
        //Create list for display hour and distance traveled
	    System.out.println(" " + "Hour          " + "Distance Traveled");
	    System.out.println("-------------------------------------");
	    
	    //Create Loop to Display hour and distance traveled
	    int period;
	    for(period = 1 ; period <= totalPeriod ; period++)
	    {
	    	System.out.println( "  " + period + "                 " + (period*speed));
        }
    }
}