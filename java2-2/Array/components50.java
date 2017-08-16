/**
 * Created by Sayaka Tamura on 9/12/2016.
   File name: components50.java
   Result ex:
    0	1	4	9	16	25	36	49	64	81	
    100	121	144	169	196	225	256	289	324	361	
    400	441	484	529	576	75	78	81	84	87	
    90	93	96	99	102	105	108	111	114	117	
    120	123	126	129	132	135	138	141	144	147 
 */

public class components50
{
   public static void main(String[] args)
   {
      // declares an array A of 50 components of the type int. 
      int[] A = new int[50];
      
      //Initialize the array so that the first 25 components
      // are equal to the square of the index variable 
      for(int i=0; i<25; i++)
         A[i]=i*i;
      
      // the last 25 components are equal to three times the index variable. 
       for(int i=25; i<A.length; i++)
         A[i]=3*i;
      
      
      //Output the  array so that 10 elements per line are printed. 
       for(int i=0; i<A.length; i++)
       {
          System.out.print(A[i]+"\t");
          if((i+1)%10==0)
               System.out.println();
       }
       System.out.println();

   }
}
   
   
 