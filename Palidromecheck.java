package tasks.com;

public class Palidromecheck {
	
	public String palindrome (String str)
	{
		int l=0;
		int r=str.length()-1;
		while(l<r)
		{
		 if(str.charAt(l)!=str.charAt(r)) 
		{
			 return "Not Palindrome";
		}
		l++;
		r--;
		 
	    }
		return "Palindrome";
	}

	public static void main(String[] args) 
	{
	 
		String a="aalaa";
		String b="123";
		Palidromecheck obj=new Palidromecheck();//to be created for class not the method 
		String palindrome=obj.palindrome(a);
		String palindrome1=obj.palindrome(b);
		System.out.println(palindrome);
		System.out.println(palindrome1);
		
		

	}

}
