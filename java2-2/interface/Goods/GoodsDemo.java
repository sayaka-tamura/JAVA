/**
 * Created by Sayaka Tamura on 11/7/2016.
   Result:
 item: Bath Soap
 price: 13.45
 item: Rice
 price: 29.8
 calories: 230.0
 
 item: Lego
 price: 89.0
 minimum age: 6
 Tax is: 7.12
 
 item: Emma
 price: 24.95
 author: Austin
 Tax is: 1.996
 */
 
public class GoodsDemo {
	public static void main(String[] args)
	{
		Goods goods1107 = new Goods("Bath Soap", 13.45);
		goods1107.display();

		Food food1107 = new Food("Rice",29.80,230);
		food1107.display();

		Toy toy1107 = new Toy("Lego", 89.00, 6);
		toy1107.display();
		System.out.println("Tax is: " + toy1107.calculateTax() + "\n" );

		Book bk1107 = new Book ( "Emma", 24.95, "Austin" );
		bk1107.display();
		System.out.println("Tax is: " + bk1107.calculateTax() + "\n" );
	}
}
