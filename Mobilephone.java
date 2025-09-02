package tasks.com;

class MobilePhone1
{
	private String brand;
	private int price;
	
	public void setValues(String type,int amt)
	{
		if(amt>1000)
		{
			brand=type;
			price=amt;
		}
	}
	public String getbrand()
	{
		return brand;
	}
	public int getprice()
	{
		return price;
	}
}



public class Mobilephone {

	public static void main(String[] args) 
	{
		
	 MobilePhone1 mob=new MobilePhone1();
	 mob.setValues("iPhone16promax",120000);
	 System.out.println("The name of the mobilePhone is: "+mob.getbrand()+" and the price is: "+mob.getprice());
	 
	}

}
