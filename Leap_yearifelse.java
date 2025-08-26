package tasks.com;

import java.util.Scanner;

public class Leap_yearifelse {

		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the year to check whether Leap year or not:");
			int num=sc.nextInt();
			 if(num%4==0)
			 {
				 System.out.println("The entered year is Leap year: "+num);
				
			 }
			 else
			 {
				 System.out.println("The entered year is not Leap year: "+num);
			 }

	}

}
