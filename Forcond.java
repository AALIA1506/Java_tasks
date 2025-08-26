package tasks.com;

public class Forcond 
{

	public static void main(String[] args)
	{
	   for(int i=100;i>=50;i--)
	   {
		   if(i%4==0)
		   {
			   System.out.println("The values of i divisible by 4  are: "+i);
		   }  
		   else if(i%2==0)
		   {
			   System.out.println("The values of i divisible by  2 are: "+i);
		   }  
		   else if(i%4==0 && i%2==0)
		   {
			   System.out.println("The values of i divisible by both 4 and 2 are: "+i);
		   }
		   else
		   {
			   System.out.println("Not divisible by these numbers");
		   }
			   
	   }
		   
	}

}
