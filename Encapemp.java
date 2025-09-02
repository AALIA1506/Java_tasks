package tasks.com;

class employeebasic
{
	private String name;
	private int salary;
	
	public void setName(String Name)
	{
		name=Name;
	}
	public String getName()
	{
		return name;//what type we are returning that should be in the function datatype also
	}
	public void setSal(int sal)
	{
		salary=sal;
	}
	public int getSal()
	{
		return salary;
	}
}
public class Encapemp {

	public static void main(String[] args) 
	{
	  employeebasic e=new employeebasic();
	  e.setName("Aalia");
	  e.setSal(1000000);
	  String out=e.getName();
	  int out1=e.getSal();
	  System.out.println("The name of the employee is:"+out);
	  System.out.println("The salary of the employee is:"+out1);

	}

}
