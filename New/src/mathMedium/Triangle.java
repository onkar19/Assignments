package mathMedium;

import java.util.Scanner;

public class Triangle
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height of triangle:");
		int height=sc.nextInt();
		System.out.println("Enter the width of triangle:");
		int base=sc.nextInt();
		
		double area=(height*base)/2;
		System.out.println("Area of triangle:"+area);

	}

}
