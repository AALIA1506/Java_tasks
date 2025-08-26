package tasks.com;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numeric string:");
		String num=sc.nextLine();
		int iv=Integer.parseInt(num);/*The wrapper class contains functions like type-casting*/
		long lv=Long.parseLong(num);
		float fv=Float.parseFloat(num);
		double db=Double.parseDouble(num);
		System.out.println("The converted string to int is :"+iv);
		System.out.println("The converted string to long is:"+lv);
		System.out.println("The converted string to float is:"+fv);
		System.out.println("The converted string to double is:"+db);
		sc.close();
		
	
	}
}
