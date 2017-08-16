<<<<<<< HEAD
/*
 * @author Sayaka Tamura
 */
 
import java.util.Scanner; // Needed for the Scanner class
public class StockCommission {
    public static void main(String[] args) {
    //Declare variables
    double stockPrice;
    double stockQuantity;
    double amountStockAlone;
    double commissionRate = 0.02;
    double amountCommission;
    double totalAmountPaid;
    
    //Create scanner object
      Scanner keyboard = new Scanner(System.in);
    //Ask user for the stock price per share
      System.out.println("How much is the stock per share?");
    //Accept the amount of the purchase
      stockPrice = keyboard.nextDouble();

    //Ask user for the stock price per share
      System.out.println("How many shares did you bought the stock?");
    //Accept the amount of the purchase
      stockQuantity = keyboard.nextDouble();

    //Calculate The amount paid for the stock alone (without the commission) 
      amountStockAlone = stockPrice*stockQuantity;
    //Calculate The amount of the commission 
      amountCommission = amountStockAlone*0.02;
    //Calculate The total amount paid (for the stock plus the commission)
      totalAmountPaid = amountStockAlone + amountCommission;

    //Display the stock price per share
      System.out.println("The stock price per share is " + stockPrice);
    //Display the quantity of the stock
      System.out.println("You bought " + stockQuantity + " shares.");
    //Display the amount of the commission
      System.out.println("The amount of the commission is " + amountCommission);
    //Display the total amount paid (for the stock plus the commission)
      System.out.println("The total amount paid is " + totalAmountPaid);
   }
}
=======
/*
 * @author Sayaka Tamura
 */
 
import java.util.Scanner; // Needed for the Scanner class
public class StockCommission {
    public static void main(String[] args) {
    //Declare variables
    double stockPrice;
    double stockQuantity;
    double amountStockAlone;
    double commissionRate = 0.02;
    double amountCommission;
    double totalAmountPaid;
    
    //Create scanner object
      Scanner keyboard = new Scanner(System.in);
    //Ask user for the stock price per share
      System.out.println("How much is the stock per share?");
    //Accept the amount of the purchase
      stockPrice = keyboard.nextDouble();

    //Ask user for the stock price per share
      System.out.println("How many shares did you bought the stock?");
    //Accept the amount of the purchase
      stockQuantity = keyboard.nextDouble();

    //Calculate The amount paid for the stock alone (without the commission) 
      amountStockAlone = stockPrice*stockQuantity;
    //Calculate The amount of the commission 
      amountCommission = amountStockAlone*0.02;
    //Calculate The total amount paid (for the stock plus the commission)
      totalAmountPaid = amountStockAlone + amountCommission;

    //Display the stock price per share
      System.out.println("The stock price per share is " + stockPrice);
    //Display the quantity of the stock
      System.out.println("You bought " + stockQuantity + " shares.");
    //Display the amount of the commission
      System.out.println("The amount of the commission is " + amountCommission);
    //Display the total amount paid (for the stock plus the commission)
      System.out.println("The total amount paid is " + totalAmountPaid);
   }
}
>>>>>>> f593ca5e163d1d71ee6cb2534f0366eef0b14678
