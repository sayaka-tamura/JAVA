/**
 *
 * @author Sayaka Tamura 
 * @version 1.00 14/03/21
 */
 
//Needed for Scanner class
import java.util.Scanner;

public class AverageRainfall {
    
    public static void main(String[] args) {
    	  //Declare variables
        double totalYears;
        double monthRainfall;
        double totalRainfall=0;
        double aveRainfall;    
            
        //Create scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //Ask user the number of years
        System.out.println("Enter the number of years you'd like to calculate the average of the rainfall");
		  System.out.println("A number less than 1 isn't accepted.");
		  //Accept the number
		  totalYears = keyboard.nextInt();
              
        //Create Loop for iterating to ask the inches of rainfall per year 
        for(int year = 1;year<=totalYears;year++)
        {	
	        //Check "totalYear" is more than 1 or not
	        while(totalYears<1)
	        {
		        //Ask user the number of years
		        System.out.println("Enter the number of years you'd like to calculate the average of the rainfall");
		        System.out.println("A number less than 1 isn't accepted.");
		        //Accept the number
		        totalYears = keyboard.nextDouble();
	        }
                 	
	        //Continue to ask about the inches of rainfall if the "totalYear" is correct 
		    for(int month = 1;month<=12;month++)
		    {
		        //Check "monthRainfall" is a negative number or not
		    	do
		    	{
			    	//Ask user the inches of rainfall each month
				    System.out.println("Enter the inches of rain fall for month" + month + ", year"+ year);
				    System.out.println("A negative number isn't accepted.");
				    //Accept the number
				    monthRainfall = keyboard.nextInt();
			    }
			    while(monthRainfall<0);
                         
            //Calculate totalRainfall
            totalRainfall+=monthRainfall;
		    }

        }  
		    //Display the number of months, total inches of rainfall and the average of rainfall per month for the entire period 
          System.out.println("Total inches of rainfall is " + totalRainfall);
          System.out.println("Average rainfall per month is: " + (totalRainfall/(totalYears * 12)));    }
}