<<<<<<< HEAD
/*
 * @author Sayaka Tamura
 * 2014/03/06
 */
 
import java.util.Scanner; 

public class SoftwareSales {
	public static void main(String[] args) {
    
    //Declare variables
    int packages;
    double discount;
    double discountAmount;
    double totalPurchase;
    
    //Create Scanner Object
    Scanner keyboard = new Scanner(System.in);
    	
    //Ask for user the quantity of the packages purchased
    System.out.println("Type the number of packages purchased.");

    //Accept the number
    packages = keyboard.nextInt();
    //determine discount based on the number of packages
    if(packages>=10&&packages<19){
        	discount = 0.2;
        }else if(packages>=20&&packages<49){
        	discount = 0.3;
        }else if(packages>=50&&packages<99){
        	discount = 0.4;
        }else if(packages>=100){
        	discount = 0.5;
        }else {
        	discount = 0;
        }
    
    	    	//Calculate the amount of the discount
    	    	discountAmount = packages*99*discount;
    	        //Calculate the total amount of the purchase after the discount
        		totalPurchase = packages*99-discountAmount;
        		
    	        //display the total amount of the purchase after the discount
        	    System.out.println("The amount of the discount is $" + discountAmount);
    	    	System.out.println("Your total amount of the purchase is $" + totalPurchase);
    }
=======
/*
 * @author Sayaka Tamura
 * 2014/03/06
 */
 
import java.util.Scanner; 

public class SoftwareSales {
	public static void main(String[] args) {
    
    //Declare variables
    int packages;
    double discount;
    double discountAmount;
    double totalPurchase;
    
    //Create Scanner Object
    Scanner keyboard = new Scanner(System.in);
    	
    //Ask for user the quantity of the packages purchased
    System.out.println("Type the number of packages purchased.");

    //Accept the number
    packages = keyboard.nextInt();
    //determine discount based on the number of packages
    if(packages>=10&&packages<19){
        	discount = 0.2;
        }else if(packages>=20&&packages<49){
        	discount = 0.3;
        }else if(packages>=50&&packages<99){
        	discount = 0.4;
        }else if(packages>=100){
        	discount = 0.5;
        }else {
        	discount = 0;
        }
    
    	    	//Calculate the amount of the discount
    	    	discountAmount = packages*99*discount;
    	        //Calculate the total amount of the purchase after the discount
        		totalPurchase = packages*99-discountAmount;
        		
    	        //display the total amount of the purchase after the discount
        	    System.out.println("The amount of the discount is $" + discountAmount);
    	    	System.out.println("Your total amount of the purchase is $" + totalPurchase);
    }
>>>>>>> f593ca5e163d1d71ee6cb2534f0366eef0b14678
}