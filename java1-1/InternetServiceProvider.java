/*
 * @author Sayaka Tamura 
 * 2014/03/07
 */
 
// Needed for the Scanner class
import java.util.Scanner; 

public class InternetServiceProvider
{    
    public static void main(String[] args)
    {
        //Declare variables 
         String netPackage;
         char netPackageAlphabet;
         int hours;
         double totalCharge;

        //Create scanner object
        Scanner keyboard = new Scanner(System.in);

        //Ask user for the Internet plan
        System.out.println("Enter the letter of the package the customer has purchased.");
        //Accept the number
        netPackage = keyboard.nextLine();
        //Ask user for the Internet plan
        System.out.println("Enter the number of hours that were used.");
        //Accept the number
        hours = keyboard.nextInt();

         //Get the first character of netPackage
        netPackageAlphabet = netPackage.charAt(0);
        //Testing the net package to calcurate a monthly bill
          switch (netPackageAlphabet)
         {
           case 'a':
           case 'A':
              if (hours<11)
              {
                //Display the result
                System.out.println(" The total charges are $ 9.95");
              } else if (hours>=11){
                //Calculate the total charges
                totalCharge = 9.95 + (hours-10)*2;
                //Display the result
                System.out.println(" The total charges are $ " + totalCharge);
              }
           break;
           case 'b':
           case 'B':
           if (hours<21){
                //Display the result
                System.out.println(" The total charges are $ 13.95");
           } else if (hours>=21){
                //Calculate the total charges
                totalCharge = 13.95 + (hours-20)*1;
                //Display the result
                System.out.println(" The total charges are $ " + totalCharge);
           } 
           break;
           case 'c':
           case 'C':
           if (hours<31)
           {
                //Display the result
                System.out.println(" The total charges are $ 13.95");
           } 
           break;
           default:
           
		   System.out.println("You entered a wrong letter");
        }
    }
}
