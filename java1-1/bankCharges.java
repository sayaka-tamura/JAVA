<<<<<<< HEAD
/*
 * @author Sayaka Tamura 
 * 2014/03/07
 */
 
// Needed for the Scanner class
import java.util.Scanner; 

public class bankCharges {
    
    public static void main(String[] args) {
//Declare variables 
         int checks;
         double totalServiceFee;

        //Create scanner object
            Scanner keyboard = new Scanner(System.in);

        //Ask user for the Internet plan
             System.out.println("Enter the number of checks written for the month");
        //Accept the number
             checks = keyboard.nextInt();

        //Testing the checks to the bank's service fees for the month.
           if (checks < 20){
                   //Calculate the bank's service fees for the month
                   totalServiceFee = 10.00 + (checks*0.10);
                   //Display the result
                   System.out.println(" The bank's service fees for the month is $ " + totalServiceFee);
           } else if (checks>=20 && checks<=39){
                   //Calculate the bank's service fees for the month
                   totalServiceFee = 10.00 + (checks*0.08);
                   //Display the result
                   System.out.println(" The bank's service fees for the month is $ " + totalServiceFee);
           } else if (checks>=40 && checks<=59){
                   //Calculate the bank's service fees for the month
                   totalServiceFee = 10.00 + (checks*0.06);
                   //Display the result
                   System.out.println(" The bank's service fees for the month is $ " + totalServiceFee);
           } else if(checks >= 60){
                   //Calculate the bank's service fees for the month
                   totalServiceFee = 10.00 + (checks*0.04);
                   //Display the result
                   System.out.println(" The bank's service fees for the month is $ " + totalServiceFee);
           }
    }
=======
/*
 * @author Sayaka Tamura 
 * 2014/03/07
 */
 
// Needed for the Scanner class
import java.util.Scanner; 

public class bankCharges {
    
    public static void main(String[] args) {
//Declare variables 
         int checks;
         double totalServiceFee;

        //Create scanner object
            Scanner keyboard = new Scanner(System.in);

        //Ask user for the Internet plan
             System.out.println("Enter the number of checks written for the month");
        //Accept the number
             checks = keyboard.nextInt();

        //Testing the checks to the bank's service fees for the month.
           if (checks < 20){
                   //Calculate the bank's service fees for the month
                   totalServiceFee = 10.00 + (checks*0.10);
                   //Display the result
                   System.out.println(" The bank's service fees for the month is $ " + totalServiceFee);
           } else if (checks>=20 && checks<=39){
                   //Calculate the bank's service fees for the month
                   totalServiceFee = 10.00 + (checks*0.08);
                   //Display the result
                   System.out.println(" The bank's service fees for the month is $ " + totalServiceFee);
           } else if (checks>=40 && checks<=59){
                   //Calculate the bank's service fees for the month
                   totalServiceFee = 10.00 + (checks*0.06);
                   //Display the result
                   System.out.println(" The bank's service fees for the month is $ " + totalServiceFee);
           } else if(checks >= 60){
                   //Calculate the bank's service fees for the month
                   totalServiceFee = 10.00 + (checks*0.04);
                   //Display the result
                   System.out.println(" The bank's service fees for the month is $ " + totalServiceFee);
           }
    }
>>>>>>> f593ca5e163d1d71ee6cb2534f0366eef0b14678
}