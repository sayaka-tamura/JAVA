/*
 * @author Sayaka Tamura
 * 2014/03/12
 */

import java.util.Scanner;

public class RunningTheRace
{    
    public static void main(String[] args) {
        //Declare variables
		String name1;
		String name2;
		String name3;
		
		int time1;
		int time2;
		int time3;
		
		//Create Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		//Ask user for runnners' name & time
		// for first runnner
		System.out.println("Enter first runner's name");
		//Accept the numeber
		name1 = keyboard.nextLine();
		System.out.println("Enter first runner's time in minutes");
		//Accept the numeber
		time1 = keyboard.nextInt();
		
		keyboard.nextLine();
		// for second runnner
		System.out.println("Enter second runner's name");
		//Accept the numeber
		name2 = keyboard.nextLine();
		System.out.println("Enter second runner's time in minutes");
		//Accept the numeber
		time2 = keyboard.nextInt();
		
		keyboard.nextLine();
		// for third runnner //
		System.out.println("Enter third runner's name");
		//Accept the numeber
		name3 = keyboard.nextLine();
		System.out.println("Enter third runner's time in minutes");
		//Accept the numeber
		time3 = keyboard.nextInt();
		
		//Determine the order
		//Display the order
		if (time1 < time2 && time1 < time3)
		{
			if (time2 < time3)
			{
			   System.out.println(name1 + "/" +  name2 + "/" + name3); 
			} 
			else 
			{
            System.out.println(name1 + "/" +  name3 + "/" + name2); 
			}
		}			
		else if (time1 > time2 && time1 < time3)
		{
			System.out.println(name2 + "/" +  name1 + "/" +  name3); 
		}
		else if (time1 < time2 && time1 > time3) 
		{
			System.out.println(name3 + "/" +  name1 + "/" +  name2); 
		}
		else if (time1 > time2 && time1 > time3);
		{
			if (time2 < time3)
			{
			   System.out.println(name2 + "/" +  name3 + "/" + name1); 
			} 
			else 
			{
				System.out.println(name3 + "/" +  name2 + "/" + name1); 
			}
		}			
    }
}