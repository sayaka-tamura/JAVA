/** *
 * @author Sayaka Tamura
 */
 
import java.util.Scanner; // Needed for the Scanner class

public class SalesTax1 {
    
    public static void main(String[] args) {
        //Declare variables
             int amountPurchase;
             double stateSalesTaxInterest = 0.04;
             double countrySalesTaxInterest = 0.02;
             double stateSalesTax;
             double countrySalesTax;
             double totalSalesTax;
             double totalSales;

        //Create scanner object
             Scanner keyboard = new Scanner(System.in);
        //Ask user for the amount of the purchase
             System.out.println("What's the amount of the purchase?");
        //Accept the amount of the purchase
             amountPurchase = keyboard.nextInt();
        //Display the amount of the purchase
             System.out.println("The amount of the purchase is " + amountPurchase);

        //Calculate  the state sales tax
             stateSalesTax = amountPurchase*stateSalesTaxInterest;
        //Display  the state sales tax
             System.out.println("The state sales tax is " + stateSalesTax);

        //Calculate the county sales tax
             countrySalesTax = amountPurchase*countrySalesTaxInterest;
        //Display the county sales tax
             System.out.println("The county sales tax is " + countrySalesTax);

        //Calculate the total sales tax
             totalSalesTax =  stateSalesTax+countrySalesTax;
        //Display the total sales tax
             System.out.println("The total sales tax is " + totalSalesTax);
     
        //Calculate the total of the sale
             totalSales =  amountPurchase+totalSalesTax;
        //Display the total of the sale
             System.out.println("The total of the sale is " + totalSales);

    }
}