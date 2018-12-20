package mathMedium;

import java.util.Scanner;

public class FibbonaciSeries 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num1=0,num2=1,num3,temp=0;
		System.out.println("ENTER THE NUMBER OF ELEMENT:");
		int num=sc.nextInt();
		System.out.print("FIBBONACI SERIES:- "+num1+" "+num2);
		for(int i=2;i<num;i++)
		{
			num3=num1+num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
		}

	}

}
