package tasks.com;

import java.util.Scanner;

enum Rank
{ Excellent,VeryGood,Good,Average };

public class Enumrank {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the score:");
		int score=sc.nextInt();
		Rank r;
		
		if(score>=90)
		{
			r=Rank.Excellent;
		
		}
		else if(score>=80)
		{
			r=Rank.VeryGood;
		}
		else if(score>=70)
		{
			r=Rank.Good;
		}
		else
		{
			r=Rank.Average;
			
		}
		System.out.println("The rank of the student based on the avg score is: "+r);
		sc.close();
	}
	

}
