class ArrayOps 
	{
		public static int  findMax( int[] arr ) 
  		{ 
			int max = arr[0];
		 	for ( int i=1; i< arr.length; i++ ) 
			{
				if ( arr[i]>max )
	 			max = arr[i];
			}
		 return max ; 
		}
 	
	 public static void main (String[] args) 
	{
	 int[] arr = { -20, 19, 1, 5, -1, 27, 19, 5 }; 
	 int biggest = findMax( arr );  //ERROR!!!
	 
	System.out.println("The maximum of arr is: "+biggest);
   } 
}
