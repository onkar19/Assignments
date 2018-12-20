package mathEasy;

import java.util.Scanner;

public class ArmstrongNumber
{

	public static void main(String[] args) 
	{
		int num=0,rem,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER:-");
		int n=sc.nextInt();
		temp=n;
		int sum=0;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			sum=sum+(rem*rem*rem);
		}
		if(temp==sum)
			System.out.println("NUMBER IS ARMSTRONG");
		else
			System.out.println("NUMBER IS NOT ARMSTRONG");
	}

}
