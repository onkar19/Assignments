package mathEasy;

import java.util.Scanner;

public class MinOfNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER FIRST NUMBER:");
		int num1=sc.nextInt();
		System.out.println("ENTER SECOND NUMBER:");
		int num2=sc.nextInt();
		if(num1<num2)
		{
			System.out.println("NUMBER "+num1+" SMALLER THAN "+num2);
		}
		else
		{
			System.out.println("NUMBER "+num2+" SMALLER THAN "+num1);
		}

	}

}
