package tasks.com;

import java.util.Scanner;

public class Factorialmethod {
	
	public int fact(int n)
	{
		int fact=1;
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args)
	{
		
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number to find factorial:");
      int n=sc.nextInt();
      Factorialmethod obj=new Factorialmethod();
      int out=obj.fact(n);
      System.out.println(out);
      sc.close();
     }

}
