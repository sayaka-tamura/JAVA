import java.util.Scanner;

/**
 * Created by Sayaka Tamura on 11/8/2016.
   File name PhoneBook.java 
   Result ex:
 Enter the user's name of No.1: 
 sayaka
 Enter the user's Phone number of No.1: 
 12345
 Enter the user's name of No.2: 
 kaz
 Enter the user's Phone number of No.2: 
 58964
 Name: sayaka
 Phone Number: 12345
 Name: kaz
 Phone Number: 58964
 */
 
public class PhoneBook {
	public static void main(String[] args)
	{
		//an array of 5 PhoneEntry as a data member.
		PhoneEntry[] member = new PhoneEntry[2];
		createPhoneList(member);

		displayPhoneList(member);

	}

	private static void createPhoneList(PhoneEntry[] mArray)
	{
		String name;
		String phoneNumber;

		//Create Scanner Object
		Scanner keyboard = new Scanner(System.in);

		//Create the phone list
		for(int i=0; i<mArray.length; i++)
		{
			//Get the member's name for PhoneList
			System.out.println("Enter the user's name of No."+ (i+1) +": ");
			name = keyboard.nextLine();

			//Get the member's phone number for PhoneList
			System.out.println("Enter the user's Phone number of No."+ (i+1) +": ");
			phoneNumber = keyboard.nextLine();

			//Create Phone list
			mArray[i] = new PhoneEntry(name, phoneNumber);
		}
	}

	private static void displayPhoneList(PhoneEntry[] mArray) {
		for(int i=0;i<mArray.length;i++)
			System.out.println(mArray[i].toString());
	}

}
