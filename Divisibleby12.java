package tasks.com;

import java.util.Scanner;

public class Divisibleby12 {
	
	//Syntx: pubic datatype fucntionname (paras)
	public int divisible(int n)
	{
		if(n%12==0)
		{
			System.out.println("The number is divisible by 12: "+n);
			return n;
		}
		else 
		{ 
			System.out.println("The number is not divisible by 12: "+n);
			return 0;
		}
	}

	public static void main(String[] args) 
	{
		Divisibleby12 obj=new Divisibleby12();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked:");
		int n=sc.nextInt();
		int out=obj.divisible(n);
		System.out.println("The result is: "+out);
		sc.close();

	}

}
