package mathMedium;

import java.util.Scanner;

public class RectangleArea 
{

	public static void main(String[] args)
	{
		int n=1;
		int area,perimeter;
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("Please enter lenth and width of rectangle:");
		int len=sc.nextInt();
		int width=sc.nextInt();
		
		area=len*width;
		perimeter=2*(len+width);
		System.out.println("Area:"+area);
		System.out.println("Perimeter:"+perimeter);
		//sc.close();
		
		
	
	}
		while(n!=0);

}
}