package mathEasy;

import java.util.Scanner;

public class Average 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        int array[]= {1000,2500,5000};
        float temp=0;
        for(int i=0;i<array.length;i++)
        {
        	temp+=array[i];
        }
        System.out.println("AVERAGE OF THREE NUMBER:"+(temp/array.length));
	}

}
