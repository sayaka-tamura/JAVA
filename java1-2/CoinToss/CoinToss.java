/*
   Author : Sayaka Tamura
   File name: CoinToss.java
   This makes constructor for sideUp using Random
   Makes setter and getter for sideUp 
*/

import java.util.Random;
public class CoinToss
{  
   private String sideUp;
      
   //Constractor
   public CoinToss()
   {
      int randNum;
		Random rand=new Random();	
		randNum=rand.nextInt(2);
		if(randNum==0)
      {
			sideUp="heads";
		}
		else
      {
			sideUp="tail";
      }
   }
   
   //Setter
   public void Toss()
   {  
		int randNum;
		Random rand=new Random();	
		randNum=rand.nextInt(2);
		if(randNum==0)
      {
			sideUp="heads";
		}
		else
      {
			sideUp="tail";
		}
     
   }
   
   //Getter
   public String getSideUp()
   {
		return sideUp;
   }
}