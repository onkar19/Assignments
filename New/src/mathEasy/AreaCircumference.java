package mathEasy;

import java.util.Scanner;

public class AreaCircumference 
{

	public static void main(String[] args)
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("ENTER THE RADIUS:");
	   float radius=sc.nextFloat();
	   double pi=3.14;
       double area = pi*(Math.pow(radius,2));
       double circumference=2*pi*radius;
       System.out.println("AREA OF CIRCLE:"+area);
       System.out.println("CIRCUMFERENCE OF CIRCLE:"+circumference);
	}

}
