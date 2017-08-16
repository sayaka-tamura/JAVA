/**
 * Write a class PhoneEntry which had two data members,
 * name and phoneNumber, to simulate the entry for a phone book.
 * It has a constructor that takes two parameters to initialize
 * the two data membersa constructor that takes two parameters to initialize
 * the two data members, and some necessary accessor methods.

 Then write a class PhoneBook which has contact,
 an array of 5 PhoneEntry, as a data member. It has:
 a constructor to initialize the contact.
 A method search which takes a parameter targetName and it
 returns the PhoneEntry of the phone with targetName.

 Write a program to test your PhoneBook.
 Prompt user to enter a name,
 display the name and phone number of the person,
 or if no entry found, display the corresponding message.

 * Created by Sayaka Tamura on 11/8/2016.
   File name: PhoneEntry.java
 */

/**
	a class PhoneEntry which had two data members
	name and phoneNumber
*/
public class PhoneEntry
{
	private String name;
	private String phoneNumber;

	/**
		a constructor that takes two parameters to initialize
		the two data members
	*/
	public PhoneEntry()
	{
		this.name = " ";
		this.phoneNumber = " ";
	}

	public PhoneEntry(String n, String p)
	{
		this.name = n;
		this.phoneNumber = p;
	}

	//Getter
	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	//Setter
	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public  String toString()
	{
		return "Name: " + name +
				"\nPhone Number: " + phoneNumber;
	}
}
