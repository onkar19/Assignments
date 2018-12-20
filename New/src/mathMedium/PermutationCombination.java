package mathMedium;

import java.util.Scanner;

public class PermutationCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER n VALUES:");
		int n=sc.nextInt();
		System.out.println("ENTER r VALUES");
		int r=sc.nextInt();
		int ncr = (factorial(n) / (factorial(n - r) * factorial(r)));
        System.out.println("ncr="+ncr);
	}

	private static  int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

}
