package tasks.com;

import java.util.Scanner;

public class Checkplus2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age to be added:");
		int age=sc.nextInt();
		int age1=age+2;
		if(age1>=18)
		{
			System.out.println("Eligible to vote: "+age1);
		}
		else
		{
			System.out.println("Not Eligible to vote");
		}
			
		

	}

}
