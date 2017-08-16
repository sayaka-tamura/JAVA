/**
 * Created by Sayaka Tamura on 10/06/2016.
   File name: PhoneEntry.java
   made a constructor, accessors, mutators
   and method of "displayInfo"
 */

public class PhoneEntry
{
 
  private String name;
  private String phoneNum;
  
  //constructor
  public PhoneEntry(String n, String p)
  {
  	 name=n;
	 phoneNum=p;
  }
  
  
    //accessors
  public String getName()
  {	
  	 return name;
  }
  
   public String getPhoneNum()
  {	
  	 return phoneNum;
  }
  
  //mutators
  public void setName(String n)
  {
  	 name=n;
  }
  
  public void setPhoneNum(String p)
  {
  		phoneNum=p;

  }
  
  public void displayInfo()
  {
  	 System.out.println(name+"\t"+phoneNum); 
  }
  
}