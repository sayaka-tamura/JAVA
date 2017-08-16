/**
 * Created by Sayaka Tamura on 9/12/2016.
   File name: ArrayEnhancedloop.java
   Result ex:
    The larget value is 2300.0
    it is at position 2
    120.0 -45.0 2300.0 -340.0 
    The total sales is 2035.0
    max = 2300.0
    120.0 -45.0 2300.0 -340.0 
*/

public class ArrayEnhancedloop
{
   public static void main(String[] args)
   {
      
      double [] sales = {120, -45, 2300, -340};
      
      double largest = sales[0];
      int maxIndex = 0;
      for (int i=1;i <sales.length;i++)
      {
         if (largest < sales[i])
            {
               largest = sales[i];
               maxIndex=i;
            }
            
      }
            
      System.out.println("The larget value is "+largest+"\n"+
                         "it is at position "+maxIndex);
                         
      //display sales with an enhanced for loop
      
      for(double s: sales)
        System.out.print(s+" ");
     
      System.out.println();      
      
      double total = 0;
      for(double s: sales)
         total += s;
      
      System.out.println("The total sales is "+total);
      
      
      double max =sales[0];
      for(double s: sales)
      {
         if(max<s)
            max=s;
      }
      System.out.println("max = "+max);
      
      //enhanced for loops are read-only
      for(double s: sales)
      {
         s = 0;
      }
      
      
      for(double s: sales)
      {
         System.out.print(s+" ");
      
      }
      System.out.println();
 }
}
