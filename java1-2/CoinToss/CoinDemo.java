/*
   Author : Sayaka Tamura
   File name: CoinDemo.java
   Result ex:
    The initial is tail
 The times of tail in 20 TIMES is 9
 The times of heads in 20 TIMES is 11
*/

public class CoinDemo
{
   public static void main (String[] args)
   {
      CoinToss CoinTossing=new CoinToss();
		int numOfHeads=0;
		int numOfTails=0;
		
		
		System.out.println("The initial is "+CoinTossing.getSideUp());
		
		for(int i=1; i<=20; i++){
			CoinTossing.Toss();
			if(CoinTossing.getSideUp().equals("heads")){
				numOfHeads++;
			}
			else{
				numOfTails++;
			}
			
		}
		
		System.out.println("The times of tail in 20 TIMES is "+numOfTails);
		System.out.println("The times of heads in 20 TIMES is "+numOfHeads);

	}
	
}