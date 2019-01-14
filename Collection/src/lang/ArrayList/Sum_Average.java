package lang.ArrayList;

public class Sum_Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		float average = 0;
		int array[] = {8,9,5,6,3,1,2,7,4};
		System.out.println("Given array elements are:-");
		for(int i = 0; i<array.length; i++)
		{
			System.out.print(array[i]+" \t");
		}
		System.out.println();
		System.out.print("Sum of array elements:");
		for(int i = 0; i<array.length; i++)
		{
			sum = sum + array[1];
			average = (float)sum/2;
			
		}
		System.out.print(sum);
		System.out.println();
		System.out.println("Average of array elements are:"+average);
		

	}

}
