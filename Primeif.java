package tasks.com;

import java.util.Scanner;

public class Primeif 
{
     public static void isPrime( int prime_not)
     {
	 if(prime_not<=1)
	 {
		 System.out.println("Not a normal number:");
	 }
	 if((prime_not==2)|| (prime_not==3)||(prime_not==5)||(prime_not==7))
	 { 
		 System.out.println("The prime number is:"+prime_not);
	  }
	 
	 if((prime_not%2==0)|| (prime_not%3==0) || (prime_not%5==0)||(prime_not%7==0))
	 {
		 System.out.println("The entered number is prime: "+prime_not);
		
	 }
     }
	 public static void main(String[] args)
	 {
       // System.out.println(isPrime(11));
        //System.out.println(isPrime(3));
	
      }
}
