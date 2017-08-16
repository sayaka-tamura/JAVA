/**
 *
 * @author Sayaka Tamura
 */
 
import java.util.Scanner; // Needed for the Scanner class

public class SalesTax2 {
    
    public static void main(String[] args) {
             int mealCharge;
             double mealTaxRate = 0.0675;
             double tipRate = 0.15;
             double taxAmount;
             double tipAmount;
             double totalBill;

        //Create scanner object
             Scanner keyboard = new Scanner(System.in);
        //Ask user for the amount of the purchase
             System.out.println("What's the charge for the meal?");
        //Accept the amount of the purchase
             mealCharge = keyboard.nextInt();
        //Display the amount of the purchase
             System.out.println("The charge for the meal is " + mealCharge);

        //Calculate  the tax amount
             taxAmount = mealCharge*mealTaxRate;
        //Display the tax amount
             System.out.println("The tax amount is " + taxAmount);

        //Calculate the tip amount
             tipAmount = mealCharge*tipRate;
        //Display the tip amount
             System.out.println("The tip amount is " + tipAmount);

        //Calculate the total bill
             totalBill =  mealCharge+taxAmount+tipAmount;
        //Display the total sales tax
             System.out.println("The total sales tax is " + totalBill);
    }
}