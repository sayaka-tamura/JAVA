/*
 * @author Sayaka Tamura
 */
 
public class EnergyDrinkConsumption {
    
    public static void main(String[] args) {
        //Declare variables
          int customer = 12467;
          double purchaseRatePerWeek = 0.14;
          double likeCitrusRate = 0.64; 
          double totalPurchasePerWeek;
          double totalLikeCitrus;
          //Calculate the approximate number of customers in the survey who purchase one or more energy drinks per week
          totalPurchasePerWeek = customer*purchaseRatePerWeek;

          //Calculate the approximate number of customers in the survey who prefer citrus-flavored energy drinks

          totalLikeCitrus =  customer*likeCitrusRate;
          //Display the approximate number of customers in the survey who purchase one or more energy drinks per week
          System.out.println("The approximate number of customers in the survey who purchase one or more energy drinks per week is "+ totalPurchasePerWeek);
          //Display the approximate number of customers in the survey who prefer citrus-flavored energy drinks
          System.out.println("The approximate number of customers in the survey who prefer citrus-flavored energy drinks is "+ totalLikeCitrus);
    }
}