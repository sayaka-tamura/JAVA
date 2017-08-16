/**
 * Created by Sayaka Tamura on 10/10/2016.
   Result ex:
 Enter the balance for account 1: 150
   Enter the balance for account 2: 200
   Enter the balance for account 3: 50
   Here are the balances of each account:
   Account 1: $150.0
   Account 2: $200.0
   Account 3: $50.0
 */
 
import java.util.Scanner;
 
public class ObjectArray {
	
	public static void main(String[] args)
	{
		final int NUM_ACCOUNTS = 3;  // Number of accounts
		BankAccount[] accounts = new BankAccount[NUM_ACCOUNTS];
		createAccounts(accounts);

		// Display the balances of each account.
		System.out.println("Here are the balances " + "of each account:");
			for (int index = 0; index < accounts.length; index++)
			{
				System.out.println("Account " + (index + 1) + ": $" + accounts[index].getBalance());
			}
	}

	private static void createAccounts(BankAccount[] array)
	{
		double balance;  // To hold an account balance

		// Create a Scanner object.
		Scanner keyboard = new Scanner(System.in);

		// Create the accounts.
		for (int index = 0; index < array.length; index++)
		{
			// Get the account's balance.
			System.out.print("Enter the balance for " + "account " + (index + 1) + ": ");
			balance = keyboard.nextDouble();

			// Create the account.
			array[index] = new BankAccount(balance);
		}
	}

}

