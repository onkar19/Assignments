package mathMedium;

import java.util.Scanner;

public class SimpleInterest
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME IN JAVA PROGRAM TO CALCULATE SIMPLE INTEREST:");
	    System.out.println("Enter principle amount:");
	    float amount=sc.nextFloat();
	    System.out.println("Enter the time period :");
	    int time=sc.nextInt();
	    System.out.println("Enter the rate :");
	    float rate=sc.nextFloat();
	    float si=(amount*time*rate)/100;  //formula
	    System.out.println("The simple interest is :" +si);
	    sc.close();

	}

}
