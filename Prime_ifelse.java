package tasks.com;

import java.util.Scanner;

public class Prime_ifelse
{

	 public static void main(String[] args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number to check whether prime or not:");
		 int prime_not=sc.nextInt();
		 if((prime_not%2==0) && (prime_not%3==0))
		 {
			 System.out.println("The entered number is prime: "+prime_not);
			
		 }
		 else
		 {
			 System.out.println("The entered number is not prime: "+prime_not);
		 }
		
	 }
	}


