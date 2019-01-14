package lang.ArrayList;

public class Prime_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int i;
		int array[] = { 2, 5, 7, 8, 5,4, 5, 8, 9 };
		System.out.println("Given array elements are:");
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
		System.out.println("Prime numbers are:");
		for( i = 0; i<array.length; i++)
		{
			boolean isPrime = true;
			for(int j = 2; j<i; j++)
			{
				if(i%j == 0)
				{
					isPrime = false;
					break;
				}
			}
			
			if(isPrime)
			{
				System.out.print(i +"\t");
			}
		}
	}

}
