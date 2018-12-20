package mathEasy;

import java.util.Scanner;

public class Exponent 
{

	public static void main(String[] args) 
	{ 
		int temp=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("PLEASE ENTER THE BASE NUM.:");
		int base=sc.nextInt();
		System.out.println("ENTER THE EXPONENT:");
		int exponent=sc.nextInt();
		while(exponent>0)
		{
			temp=temp*base;
			--exponent;
		}
		System.out.println("ANSWER:"+temp);
	}

}
