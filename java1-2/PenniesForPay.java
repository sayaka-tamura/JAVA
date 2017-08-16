/**
 *
 * @author Sayaka Tamura
 * @version 1.00 14/03/21
 */
 
//Needed import Scannner Class
import java.util.Scanner;

public class PenniesForPay {
    
    public static void main(String[] args) {
        //Declare Variable
        double totalDay;
        
        //Create Scanner Object
        Scanner keyboard  = new Scanner(System.in);
        
        do
        {
        	//Ask User the period of time he earned
        	System.out.println("Enter the number of the days worked.");
        	System.out.println("Don't type a numeber less than 1 for the number of the days worked.");
        	totalDay = keyboard.nextDouble();
        }
        while(totalDay<0);//Check the condition, it's (day>0) or not
        
               
        //Create list for display hour and distance traveled
	    System.out.println(" " + "Day          " + "The money you earned");
	    System.out.println("-------------------------------------");

	    //Create Loop to Display hour and distance traveled
	    int day;
	    int payPerday;
	    int payYesterday=1;
       int payTotal=0;
	    
	    for(day = 1 ; day <= totalDay ; day++)
	    {
         payTotal+=payYesterday;
	    	payPerday = payYesterday*2;
	    	System.out.println( "  " + day + "                 " + payYesterday);
	    	payYesterday = payPerday;
       }
       
       System.out.println( "Your total pay at the end of period is " + payTotal);
       
    }
}