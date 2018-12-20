package mathEasy;

import java.util.Scanner;

public class SumOfDigit
{
    public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		   int sum=0;
           Scanner sc=new Scanner(System.in);
           System.out.print("ENTER A NUMBER:-");
           int num=sc.nextInt();
           while(num>0)
           {
        	   sum=sum+num%10;
        	   num=num/10;
           }
           System.out.println("SUM OF THE DIGIT IS:" +sum);
	}

}
