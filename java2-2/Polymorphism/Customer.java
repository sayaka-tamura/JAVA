/**
 * Created by Sayaka Tamura on 11/29/2016.
 */
public class Customer extends Person
{
	private int idnumber;
	private boolean onlist;

	public Customer(int idnumber, boolean onlist, String name, String phonenumber, String address)
	{
		super(name, address, phonenumber);
		this.idnumber = idnumber;
		this.onlist = onlist;
	}

	//Setter
	public void setIdNumber(int idnumber)
	{
		this.idnumber = idnumber;
	}
	public void setToBeOnList(boolean onlist)
	{
		if(onlist = true)
		{
			System.out.println("The customer wants to be on the mailing list.");
		}
	}

	//Getter
	public int getIdNumber()
	{
		return idnumber;
	}
	public boolean getToBeOnList()
	{
		return onlist;
	}
}