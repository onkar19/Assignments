package mathEasy;

import java.util.Scanner;

public class PowerOfDigit
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER:-");
        int num=sc.nextInt();
        System.out.println("SQUARE OF " +num+ " IS:"+Math.pow(num,2));
	}

}
