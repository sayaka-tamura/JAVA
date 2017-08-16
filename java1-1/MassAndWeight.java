<<<<<<< HEAD
/*
 * @author Sayaka Tamura 
 */
 
import java.util.Scanner;
 
public class MassAndWeight {
    
    public static void main(String[] args) {
               double mass;
               double weight;
        //Create scanner object
             Scanner keyboard = new Scanner(System.in);
        //Ask user for an objectÅfs mass
             System.out.println("Enter an objectÅfs mass in kilogram");
        //Accept the number
             mass = keyboard.nextDouble();

        //Calculate the object's weight
             weight = mass*9.8;
        //Display the result
              if (weight < 10) { 
              System.out.println("the object's weight is " + weight +"kg."); 
              System.out.println("the object is too light."); 
              } else if (weight > 1000) { 
              System.out.println("the object's weight is " + weight +"kg."); 
              System.out.println("the object is too heavy."); 
              } else { 
              System.out.println("the object's weight is " + weight +"kg."); 
              } 

    }
=======
/*
 * @author Sayaka Tamura 
 */
 
import java.util.Scanner;
 
public class MassAndWeight {
    
    public static void main(String[] args) {
               double mass;
               double weight;
        //Create scanner object
             Scanner keyboard = new Scanner(System.in);
        //Ask user for an objectÅfs mass
             System.out.println("Enter an objectÅfs mass in kilogram");
        //Accept the number
             mass = keyboard.nextDouble();

        //Calculate the object's weight
             weight = mass*9.8;
        //Display the result
              if (weight < 10) { 
              System.out.println("the object's weight is " + weight +"kg."); 
              System.out.println("the object is too light."); 
              } else if (weight > 1000) { 
              System.out.println("the object's weight is " + weight +"kg."); 
              System.out.println("the object is too heavy."); 
              } else { 
              System.out.println("the object's weight is " + weight +"kg."); 
              } 

    }
>>>>>>> f593ca5e163d1d71ee6cb2534f0366eef0b14678
}