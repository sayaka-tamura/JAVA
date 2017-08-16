/**
 * Created by Sayaka Tamura on 11/7/2016.
 */
public class Food extends Goods
{
		private double calories;
		public Food(String des, double pr, double cal)
		{
			super( des, pr );
			calories = cal ;
		}
		public void display()
		{
			super.display();
			System.out.println( "calories: " + calories + "\n");
		}
}
