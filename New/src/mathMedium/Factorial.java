package mathMedium;

import java.util.Scanner;

public class Factorial 
{

	public static void main(String[] args)
	{
		int factorial=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int fact=sc.nextInt();
		for(int i = 1;i<=fact;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("Factorial of number is: "+factorial);

	}

}
