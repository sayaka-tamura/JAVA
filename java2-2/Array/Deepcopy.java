/**
 * Created by Sayaka Tamura on 9/12/2016.
   File name: Deepcopy.java
   Result ex:
     They are not the same arrays.      
 */


public class Deepcopy
{
   public static void main(String[] args)
   {
      // wrong way to copy arrays (shallow copy)
      /*
      int num1 = 5;
      int num2 = num1;
      
      System.out.println("num1="+num1+"\tnum2="+num2);
      
      num1 = 10;
      
     System.out.println("num1="+num1+"\tnum2="+num2);
     */
     /*
     int[] array1 ={10, 4, 2, 34, 5};
     int[] array2 = array1;
     
     System.out.print("Array1: ");
     for(int a: array1)
      System.out.print(a+" ");
    
     System.out.println();
    
     System.out.print("Array2: ");
     for(int a: array2)
      System.out.print(a+ " ");
    
     System.out.println();
      
     array2[3]=1000;
   
     System.out.println("After updated array1:");
    
     System.out.print("Array1: ");
     for(int a: array1)
      System.out.print(a+" ");
    
     System.out.println();
    
     System.out.print("Array2: ");
     for(int a: array2)
      System.out.print(a+ " ");
    
     System.out.println();
     */
     /*
     //deep copy
     int[] array1 ={10, 4, 2, 34, 5};
     int[] array2 = new int[array1.length];//allocate the amount of memory as array1
      
     //copy the each element from array1 to the corresponding postion of array2
     for(int i=0; i<array1.length; i++)
         array2[i]=array1[i];   
     
     //print Array1    
     System.out.print("Array1: ");
     for(int a: array1)
      System.out.print(a+" ");
    
     System.out.println();
     
     //print Array2
     System.out.print("Array2: ");
     for(int a: array2)
      System.out.print(a+ " ");
    
     System.out.println();
     
     //addresses of two arrays are compared
     if(array1==array2)  
         System.out.println("They are the same.");
     else
        System.out.println("They are not the same.");
     
     //print address of Array1
     System.out.println("array1 is at "+array1);
     //print address of Array2  
     System.out.println("array2 is at "+array2);
     
     int[] array3=array1; //shallow copy
        
     System.out.println("array1 is at "+array1);
       
     System.out.println("array3 is at "+array3);          

     //chanege array1[2]
     array1[2]=1000;
   
     System.out.println("After updated array1:");
     //print array1
     System.out.print("Array1: ");
     for(int a: array1)
      System.out.print(a+" ");
    
     System.out.println();
     
     //print array2
     System.out.print("Array2: ");
     for(int a: array2)
      System.out.print(a+ " ");
    
     System.out.println();
     */
       
     //compare two arrays
     
     int[] array1={1, 2, 3, 4, 5};
     int[] array2={1, 2, 6, 4, 5};
     
     if(array1.length != array2.length)
     {
       System.out.println("They are not the same length arrays.");
     }
     else
     {
         int i=0;
         for(i=0; i<array1.length; i++)
         {
              if(array2[i]!=array1[i]) 
              {
                 System.out.println("They are not the same arrays.");
                 break;
              }
              
         }
         if(i==array1.length) //it compared every pair of the elements in the array
            System.out.println("They are the same arrays.");
  
     }
     
   }

}