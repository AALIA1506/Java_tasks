package tasks.com;

class Login1
{
	private String username;
	private String password;
	
	public void setValues(String name,String pass)
	{
		username=name;
		password=pass;
	}
	public String getname()
	{
		return username;
	}
}
public class Login {

	public static void main(String[] args) 
	{
		Login1 log=new Login1();
		log.setValues("Aalia","Aalia_15");
		System.out.println("The values are: "+log.getname());	

	}

}
