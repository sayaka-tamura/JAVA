/**
 * Created by Sayaka Tamura on 10/26/2016.
   file name: Stock.java 
 */
public class Stock
{
	private String symbol;     // Trading symbol of stock
	private double sharePrice; // Current price per share


	public Stock(String sym)
	{
		this(sym, 0);
	}

	public Stock(String sbl, double price)
	{
		symbol = sbl;
		sharePrice = price;
	}

	public Stock(Stock object2)
	{
		symbol = object2.symbol;
		sharePrice = object2.sharePrice;
	}

	public String getSymbol()
	{
		return symbol;
	}
	public double getSharePrice()
	{
		return sharePrice;
	}
	public String toString()
	{
		String str = "Trading symbol: " + symbol +
				"\nShare price: " + sharePrice;
		return str;
	}

	public boolean equals(Stock object2)
	{
		boolean status;

		// Determine whether this object's symbol and
		// sharePrice fields are equal to object2's
		// symbol and sharePrice fields.
		if (symbol.equals(object2.symbol) &&
				sharePrice == object2.sharePrice)
			status = true;  // Yes, the objects are equal.
		else
			status = false; // No, the objects are not equal.

		// Return the value in status.
		return status;
	}

}
