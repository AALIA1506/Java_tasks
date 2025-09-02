package tasks.com;
import java.util.*;


class Emp
{
	String name;
	int salary;
	
	public void displayDetails(String name, int sal)
	
	{
		
		System.out.println("The name of the employee is: "+name+" and their salary is:"+sal);
	}
}


public class Employee {

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the employee:");
		String name=sc.nextLine();
		System.out.println("Enter the salary of the employee:");
		int salary=sc.nextInt();

		Emp e=new Emp();
		/*e.name="Aalia";
		e.salary=1000000;*/
		e.displayDetails(name,salary);
		sc.close();

	}

}
