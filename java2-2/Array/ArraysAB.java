/**
 * Created by Sayaka Tamura on 9/12/2016.
   File name: ArraysAB.java
   Result ex:
   Array A:
 0	1	4	9	16	25	36	49	64	81	
 100	121	144	169	196	225	256	289	324	361	
 400	441	484	529	576	75	78	81	84	87	
 90	93	96	99	102	105	108	111	114	117	
 120	123	126	129	132	135	138	141	144	147	
 Array B:
 147	144	141	138	135	132	129	126	123	120	
 117	114	111	108	105	102	99	96	93	90	
 87	84	81	78	75	576	529	484	441	400	
 361	324	289	256	225	196	169	144	121	100	
 81	64	49	36	25	16	9	4	1	0	
 
 */

public class ArraysAB
{

	public static void main(String[] args)
	{
		//declares an array A of 50 components of the type int. 
		int[] A=new int[50];
		
		
		//Initialize the array so that the first 25 components 
		//are equal to the square of the index variable
		for(int i=0; i<25; i++)
			A[i]=i*i;
		
		 //and the last 25 components are equal to three times the index variable. 
		 for(int i=25; i<50; i++)
			A[i]=3*i;
 
		System.out.println("Array A:");
      
		 //Output the  array so that 10 elements per line are printed. 
		 for(int i=0; i<50; i++)
		 {
		 	 	System.out.print(A[i]+"\t");
				if((i+1)%10==0)
					System.out.println();
		 }			
		 
     //Create an array B of size 50, and then copy elements of array A in  reversed order to array B. Display array B.

		int[] B=new int[50];
		for(int i=0; i<B.length; i++)
		{
			B[i]=A[B.length-1-i];
		}
	
		System.out.println("Array B:");
		
		for(int i=0; i<B.length; i++)
		 {
		 	 	System.out.print(B[i]+"\t");
				if((i+1)%10==0)
					System.out.println();
		 }	
	
	}
}