package tasks.com;

import java.util.Scanner;

public class TernaryMonsoon {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice:");
		int choice=sc.nextInt();
		
		String mon=(choice==1)?"Summer":
		           (choice==2)?"Autumn":
		           (choice==3)?"Winter":"Spring";
		System.out.println("The monsoon is:"+mon);
		sc.close();
		
	}

}
