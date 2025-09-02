package tasks.com;

class Cars
{
	private String brand;
	private int model,year;
	
	public void setValues(String type,int mod,int yrs)
	{
		if(yrs<=2025)//if doesnt satisfy null for strings and 0 for other datatypes
		{
			brand=type;
			model=mod;
			year=yrs;
		}
	}
	public String getbrand()
	{
		return brand;
	}
	public int getmodel()
	{
		return model;
	}
	public int getyear()
	{
		return year;
	}
}


public class Carmodel {

	public static void main(String[] args) 
	{
	
		Cars c=new Cars();
		c.setValues("Audi", 120,2024);
		System.out.println("The brand of the car is: "+c.getbrand()+" and "
				+ "the model of the car is: "+c.getmodel()+" and the year of the car is:"+c.getyear());

	}

}
