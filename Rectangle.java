package tasks.com;

class Rectangle1
{
	private int length;
	private int width;
	

	public void setValues(int l,int w)
	{
		if(l>0 && w>0)
		{
			length=l;
			width=w;
		
		}
	}
	public int getlength()
	{
		return length;
		
	}
	public int getwidth()
	{
		return width;
	}
	public int calc(int l,int w)
	{
		int area=l*w;
		return area;
	}
}

public class Rectangle {

	public static void main(String[] args) 
	{
		Rectangle1 r=new Rectangle1();
		r.setValues(10,20);
		System.out.println("The length and width of the rectangle are:");
		System.out.println(r.getlength());
		System.out.println(r.getwidth());
		System.out.println("The area of the rectangle is:");
		System.out.println(r.calc(10,20));
		

	}

}
