package tasks.com;

import java.util.Scanner;

public class Pos_neg_zeroifelse {

	public static void main(String[] args) 
	{
			  Scanner sc=new Scanner(System.in);
			  System.out.println("Enter the number to check whether pos, neg or zero: ");
			  int num=sc.nextInt();
			  if((num>0))
			  {
				  System.out.println("Entered number is Positive:"+num);
			  }
			  else if(num<0)
			  {
				  System.out.println("Entered number is Negative:"+num);
			  }
			  else
			  {
				  System.out.println("Entered number is Zero:"+num);
			  }
			
		  }
		
	}


