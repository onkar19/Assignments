package lang_Loops;

import java.util.Scanner;

public class Prime_Number_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check:-");
		int num = sc.nextInt();
		for(int i = 1; i<=num; i++)
		{
			if(num % i == 0)
			{
				count++;
			}
		}	
				if(count == 2)
				{
					System.out.println("Number is Prime.");
				}
				else
				{
					System.out.println("Number is not prime. ");
				}
				
			
		

	}

}
