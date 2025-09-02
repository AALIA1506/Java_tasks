package tasks.com;

import java.util.Scanner;

public class TernaryRGB {

	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the choice:");
			int choice=sc.nextInt();
			
			String Color=(choice==1)?"Red":
			           (choice==2)?"Blue":
			           (choice==3)?"Green":"Invalid";
			System.out.println("The RGB color selected is:"+Color);
			sc.close();

	}

}
