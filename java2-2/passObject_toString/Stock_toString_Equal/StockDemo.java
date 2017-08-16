/**
 * Created by Sayaka Tamura on 10/26/2016.
   file name: StockDemo.java
   
   Result: Both objects are the same.
 */
public class StockDemo
{
	public static void main(String[] args)
	{
//		Stock xyzCompany = new Stock ("XYZ", 9.62);
//		 /* Display the object's values. (it implicitly calls toString())*/
//		System.out.println(xyzCompany);
//    or System.out.println(xyzCompany.toString());

		Stock company1 = new Stock("XYZ", 9.62);
		//Stock company2 = new Stock("XYZ", 9.62);
		//Stock company2 =new Stock(company1.getSymbol(), company1.getSharePrice());
		Stock company2 = new Stock(company1);


		if (company1.equals(company2))
			System.out.println("Both objects are the same.");
		else
			System.out.println("The objects are different.");

	}
}