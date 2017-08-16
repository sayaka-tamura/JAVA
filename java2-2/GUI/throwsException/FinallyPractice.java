/**
 * Created by Sayaka Tamura on 12/14/2016.
   File name: FinallyPractice.java
*/

import java.util.* ;
public class FinallyPractice{
  public static void main ( String[] args )
  {
   Scanner scan = new Scanner( System.in  );
    int num=0, div=0 ; 
    
    
    try 
    {

        System.out.print("Enter the numerator: ");
        num = scan.nextInt();
        System.out.print("Enter the divisor  : ");
        div = scan.nextInt(); 
        
       System.out.println( div + " / " + num + " is " + (div/num) + " rem " + (div%num) );

    }
    catch (ArithmeticException ex )
    { 
      System.out.println("You can't divide " + num + " by " + div);
    }
    // catch(Exception ex) //exception catch all
//     {
//       System.out.println("Something went wrong");
//     }
    finally
    {
      System.out.println("If something went wrong, you entered bad data." );
    }
  }
}