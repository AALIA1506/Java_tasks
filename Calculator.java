package tasks.com;
import java.util.Scanner;

public class Calculator {
	
	public int add(int a,int b)
	{
		int add=a+b;
		return add;
	}
	public int sub(int a,int b)
	{
		int sub=a-b;
		return sub;
	}
	public int mul(int a,int b)
	{
		int mul=a*b;
		return mul;
	}
	public int div(int a,int b)
	{
		int div=a/b;
		return div;
	}

	public static void main(String[] args) 
	{
		 Calculator obj=new Calculator();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the value of a:");
		 int a=sc.nextInt();
		 System.out.println("Enter the value of b:");
		 int b=sc.nextInt();
		 
		 int add=obj.add(a,b);
		 int sub=obj.sub(a,b); 
		 int mul=obj.mul(a,b); 
		 int div=obj.div(a,b); 
		
		 System.out.println("The calculated values are:"+add+" "+sub+" "+mul+" "+div);
         sc.close();
	}

}
