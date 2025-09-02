package tasks.com;

class Calculatorbasic
{
	int  a,b;
	
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	public int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}
	
	public int mul(int a,int b)
	{
		int c=a*b;
		return c;
	}
	
	public int div(int a,int b)
	{
		int c=a/b;
		return c;
	}
}


public class Calculatoroops {

	public static void main(String[] args) 
	{
		Calculatorbasic cal=new Calculatorbasic();
		cal.a=20;
		cal.b=10;
		int add=cal.add(cal.a,cal.b);
		int sub=cal.sub(cal.a,cal.b);
		int mul=cal.mul(cal.a,cal.b);
		int div=cal.div(cal.a,cal.b);
		System.out.println("The addition value of a and b is:"+add);
		System.out.println("The addition value of a and b is:"+sub);
		System.out.println("The addition value of a and b is:"+mul);
		System.out.println("The addition value of a and b is:"+div);
		
		

	}

}
