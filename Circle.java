package tasks.com;

import java.util.Scanner;

class Circle2
{
	int radius;
	
	double calculateArea(int r)
	{   
	
		double area=3.14*r*r;
		return area;
		
	}
	 double calculateCircum(int r)
	{
		double circum=2*3.14*r;
		return circum;
	}
}
public class Circle {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the raduis of the cirle:");
	int r=sc.nextInt();
    Circle2 c=new Circle2();
    double area=c.calculateArea(r);
    double circum=c.calculateCircum(r);
    
   System.out.println("The area of the circle is:"+area);
   System.out.println("The circumference of the circle is:"+circum);
}

}
