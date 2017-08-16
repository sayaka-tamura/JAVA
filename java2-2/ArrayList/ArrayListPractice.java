/**
 * Created by Sayaka Tamura
   File name: ArrayListPractice.java
   Result ex:
    ALICE
    BOB
    CATHY
    [Alice, David, Cathy]
    [David, Cathy]
    [Amy, David, Cathy]
    [Amy, Cathy, David]
    [5, 0, 6, 5, 8, 4, 6, 0, 5, 1, 0, 7, 5, 9, 1]
    [99.99, 54.99, 34.59]
    189.57
 */

import java.util.*;

public class ArrayListPractice
{
  public static void main(String[] args)
   {
      ArrayList<String> nameList = new ArrayList<String>();
      
      nameList.add("Alice");
      nameList.add("Bob");
      nameList.add("Cathy");
      
      //System.out.println(nameList);// toString();
      
      //make all character to uppercase
      for(int i=0; i<nameList.size(); i++)
      {
         System.out.println(nameList.get(i).toUpperCase());
      }
      
      nameList.set(1, "David");
      System.out.println(nameList); 
     
     //nameList.clear();
     //System.out.println(nameList +""+ nameList.size()); 
     
     nameList.remove("Alice");
     System.out.println(nameList); 
     
     nameList.add(0, "Amy");
     System.out.println(nameList); 
     
     Collections.sort(nameList);
     System.out.println(nameList); 
     
     //convert an arrayList to an array
     String[] names = new String[nameList.size()];
     nameList.toArray(names);


      //unexpected type: arrayList can not use primitive data types
   
      //ArrayList<int> numList = new ArrayList<int>();
      //ArrayList<double> numList = new ArrayList<double>();
      
      ArrayList<Integer> numList = new ArrayList<Integer>();
      /*
         numList.add(1); //auto-boxing
         numList.add(5);   
         numList.add(-12);
      */
      
      Random rand=new Random();
      for(int i=0; i<15; i++)
      {
         numList.add(rand.nextInt(10));
      }
      
      System.out.println(numList);
     // System.out.println(numList.get(15));
   
      ArrayList<Double> priceList = new ArrayList<Double>();
      priceList.add(99.99);
      priceList.add(54.99);
      priceList.add(34.59);
      System.out.println(priceList);
      
      double total =0;
      
      for(int i=0; i<priceList.size(); i++)
         total += priceList.get(i); //auto-unboxing
      
      System.out.println(total);
   
   }
}