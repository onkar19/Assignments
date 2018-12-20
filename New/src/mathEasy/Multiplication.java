package mathEasy;

import java.util.Scanner;

public class Multiplication 
{

	public static void main(String[] args) 
	{
		int result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER:");
		int num=sc.nextInt();
		System.out.println("MULTIPLICATION TABLE:");
		for(int i=1;i<=10;i++)
		{
			result=num*i;
		    System.out.println(num+" x "+i+" = "+result);
		}
	}

}
