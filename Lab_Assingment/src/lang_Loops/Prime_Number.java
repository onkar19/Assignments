package lang_Loops;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Enter the number to check prime or composite:");
		int num = sc.nextInt();
		if(num == 0 || num == 1)
		{
			System.out.println(num+ "is neither prime nor composite. ");
		}
		for( i = 2; i<=num-1; i++)
		{
			if(num%i == 0)
			{
				System.out.println(num+ " is composite");
				break;
			}
		}
			if(num == i)
			{
				System.out.println(num+ " is even");
			}
		}

	}


