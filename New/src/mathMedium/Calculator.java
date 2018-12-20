package mathMedium;

import java.util.Scanner;

public class Calculator 
{
	public static void main(String args[])
	{
		float num1,num2,result;
		int choice;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Main menu:\n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division\n5.exit");
			System.out.println("Enter your choice:");
			 choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter two number:");
				num1=sc.nextFloat();
				num2=sc.nextFloat();
			    result=num1 + num2;
				System.out.println("Result:"+result);
				break;
			case 2:
				System.out.println("Enter two number:");
			    num1=sc.nextFloat();
			    num2=sc.nextFloat();
			    result=num1 - num2;
				System.out.println("Result:"+result);
				break;
			case 3:
				System.out.println("Enter two number:");
			    num1=sc.nextFloat();
			    num2=sc.nextFloat();
			    result=num1 * num2;
				System.out.println("Result:"+result);
				break;
			case 4:	
				System.out.println("Enter two number:");
			    num1=sc.nextFloat();
			    num2=sc.nextFloat();
			    result=num1 / num2;
				System.out.println("Result:"+result);
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice");
				
			}
		}
		while(choice!=5);
	}
}