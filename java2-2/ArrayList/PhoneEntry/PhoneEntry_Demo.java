/**
   Created by Sayaka Tamura on 10/6/2016.

	Create PhoneEntry objects as much as you want.
	PhoneEntry.java is provided and store them in an "ArrayList".
	Use a loop to display the contents of each object in the ArrayList.
   
   Result ex:
    Please Enter name and phone number for each person:
 Name: sayaka
 Phone Number: 12345
 Name: kaz
 Phone Number: 98765
 Alice	1234
 Bob	1444
 Cathy	2569
 sayaka	12345
 kaz	98765
*/

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneEntry_Demo
{
	public static void main (String[] args)
	{
		ArrayList<PhoneEntry> contactList = new ArrayList<PhoneEntry>();
      
      //Test
		contactList.add(new PhoneEntry("Alice","1234"));
		contactList.add(new PhoneEntry("Bob","1444"));
		contactList.add(new PhoneEntry("Cathy","2569"));
      
      //For user-input
		System.out.println("Please Enter name and phone number for each person:");
		Scanner keyboard = new Scanner(System.in);
		for(int i= 0; i<2; i++)
		{
			System.out.print("Name: ");
			String name = keyboard.nextLine();

			System.out.print("Phone Number: ");
			String phone = keyboard.nextLine();

			PhoneEntry entry = new PhoneEntry(name,phone);
			contactList.add(entry);
		}
      
      //display        
      for(int i=0; i<contactList.size(); i++)
            contactList.get(i).displayInfo();
	}
}
