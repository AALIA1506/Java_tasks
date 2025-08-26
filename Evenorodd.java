package tasks.com;

import java.util.Scanner;

public class Evenorodd 
{
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number to check whether even or odd: ");
    	int even_odd=sc.nextInt();
    	if(even_odd%2==0)
    	{
    		System.out.println("The number entered is even: "+even_odd);
    	}
    }
}
