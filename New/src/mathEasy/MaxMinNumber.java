package mathEasy;

import java.util.Scanner;

public class MaxMinNumber
{

	public static void main(String[] args) 
	{
		int array[]= {70,20,3,40,50};
		int maxNum=array[0];
		int minNum=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>maxNum)
			{
				maxNum=array[i];
			}
			if(array[i]<minNum)
			{
				minNum=array[i];
			}
		}
		System.out.println("LARGEST NUMBER:"+maxNum);
		System.out.println("SMALLER NUMBER:"+minNum);

	}

}
