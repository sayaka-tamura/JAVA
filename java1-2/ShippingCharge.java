/**
 *
 * @author Sayaka Tamura
 * @version 1.00 14/03/03
 */
// Needed for the Scanner class
import java.util.Scanner;

public class ShippingCharge {
    
    public static void main(String[] args) {
    //Declare variables
	int weight;
	int miles;
	
	//Scanner Object
	Scanner keyboard = new Scanner(System.in);
	
	//Ask for user the weight
	System.out.println("Enter the weight of package by pounds.");
	//Accept the weight
	weight = keyboard.nextInt();
	//Ask for user the mile
	System.out.println("Enter the miles it's shipped.");
	//Accept the mile
	miles = keyboard.nextInt();
	
		//Calculate the shipping charges
		if(weight<=2)
		{
			if(miles%500==0)
			{
				System.out.println("the shipping charges is $" +1.10*(miles/500));
			}
			else
			{
				System.out.println("the shipping charges is $" +1.10*((miles/500)+1));
			} 
		} 
		else if(weight>2 && weight<=6)
		{
			if(miles%500==0)
			{
				System.out.println("the shipping charges is $" +2.20*(miles/500));
			}
			else
			{
				System.out.println("the shipping charges is $" +2.20*((miles/500)+1));
			} 
		}
		else if(weight>6 && weight<=10)
		{
			if(miles%500==0)
			{
				System.out.println("the shipping charges is $" +3.70*(miles/500));
			}
			else
			{
				System.out.println("the shipping charges is $" +3.70*((miles/500)+1));
			} 
		}
		else if(weight>10)
		{
			if(miles%500==0)
			{
				System.out.println("the shipping charges is $" +3.80*(miles/500));
			}
			else
			{
				System.out.println("the shipping charges is $" +3.80*((miles/500)+1));
			} 
		}  
    }
}