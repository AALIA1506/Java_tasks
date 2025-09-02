package tasks.com;

import java.util.Scanner;

public class Divisibleby2ter {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked whether divisible by 2 or not:");
		int num=sc.nextInt();
		
		String out=(num%2==0)?"true":"false";//since the ans is string to be stored in string
		System.out.println("The number "+num+" is divisible by 2 is "+out);

	}

}
