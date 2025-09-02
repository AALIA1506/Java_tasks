package tasks.com;

class Student1
{
	private int rollno;
	private String name;
	private int marks;
	
	public void setValues(int rno,String Name,int score)
	{
		if(score>0)
		{
			rollno=rno;
			name=Name;
			marks=score;
		}
	}
	public int getRno()
	{
		return rollno;
	}
	public String getName()
	{
		return name;
	}
	public int getScore()
	{
		return marks;
	}
}

public class Student {

	public static void main(String[] args) 
	{
	    Student1 s1=new Student1();
	    s1.setValues(101,"Aalia",100);
        int rno=s1.getRno();
        String name=s1.getName();
        int marks=s1.getScore();
        System.out.println("The rollno of the student is: "+rno+" and the name of the"
                           + " student is: "+name+" and the marks obtained are:"+marks);
        
	}

}
