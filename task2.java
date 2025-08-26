package tasks.com;

import java.util.Scanner;

public class task2 
{
   public static void main(String[] args)
   {
	   Scanner value=new Scanner(System.in);
	   System.out.println("Enter the value in Celsius:");
	   double cfk=value.nextDouble();
	   System.out.println("Enter the value Farenheit:");
	   double fck=value.nextDouble();
	   System.out.println("Enter the value in Kelvin:");
	   double kcf=value.nextDouble();
	   /*if (cfk==1)(cfk==2)(cfk==3)
	    * {
	    * 1:perform all celsius functions
	    * 2:perform all farenheit functions
	    * 3:perform all kelvin functions
	    * }
	    * */
	    
	   double celtofar=((cfk* 9 / 5) + 32);
	   double celtokel= (cfk+ 273.15);
	   double fartocel= ((fck - 32) * 5 / 9);
	   double fartokel=((fck- 32) * 5 / 9 + 273.15);
	   double keltocel=(kcf - 273.15);
	   double keltofar=((kcf - 273.15) * 9 / 5 + 32);
	   
	   System.out.println("The Conversion of Celsius to Farenheit is: "+celtofar);
	   System.out.println("The Conversion of Celsius to Kelvin is: "+celtokel);
	   System.out.println("The Conversion of Fareheit to Celsius is: "+fartocel);
	   System.out.println("The Conversion of Fareheit to Kelvin is: "+fartokel);
	   System.out.println("The Conversion of Kelvin to Celsius is: "+keltocel);
	   System.out.println("The Conversion of Kelvin to Farenheit is: "+keltofar);
	   value.close();
	   
	   
	   
   }
   
}
