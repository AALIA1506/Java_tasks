package tasks.com;

import java.util.Scanner;

public class Task2i
{

	public static void main(String[] args)
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the method of conversion to be chosen(1-3):");
	    double value=sc.nextDouble();
	    
	    if(value==1)
	    {
	     System.out.println("Enter the Value in Celsius:");
	     double cfk=sc.nextDouble();
	     double celtofar=((cfk* 9 / 5) + 32);
	     System.out.println("The Conversion of Celsius to Farenheit is: "+celtofar);
		 double celtokel= (cfk+ 273.15);
		 System.out.println("The Conversion of Celsius to Kelvin is: "+celtokel);
	    }
	    
	    else if(value==2)
	    {
	    	 System.out.println("Enter the Value in Farenheit:");
		     double fck=sc.nextDouble();
		     double fartocel= ((fck - 32) * 5 / 9);
			 System.out.println("The Conversion of Fareheit to Celsius is: "+fartocel);
			 double fartokel=((fck- 32) * 5 / 9 + 273.15);
			 System.out.println("The Conversion of Fareheit to Kelvin is: "+fartokel);
	    }
	    
	    else if(value==3)
	    {
	    	 System.out.println("Enter the value in Kelvin:");
	    	 double kcf=sc.nextDouble();
	    	 double keltocel=(kcf - 273.15);
	    	 System.out.println("The Conversion of Kelvin to Celsius is: "+keltocel);
	  	     double keltofar=((kcf - 273.15) * 9 / 5 + 32);
	  	     System.out.println("The Conversion of Kelvin to Farenheit is: "+keltofar);
	    }
	    else
	    {
	    	System.out.println("The required conversion isn't within range(1-3),Try again!!");
	    }
		 sc.close();
	}
	
	

}
