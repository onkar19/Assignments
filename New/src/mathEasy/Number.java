package mathEasy;

import java.util.Scanner;

public class Number
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER:");
		int num=sc.nextInt();
		if(num==0)
		{
			System.out.println("NUMBER IS EQUAL TO ZERO");
		}
		     else if(num>0)
		     {
			 System.out.println("NUMBER IS GREATER THAN ZERO");
		}
		else
		{
			System.out.println("NUMBER IS LESS THAN ZERO");
		}
    }

}
