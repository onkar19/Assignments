package lang_Array;

public class Even_Array_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {2,5,6,7,9,12,25,26,98};
		
		System.out.println("Given array elements are:-");
		for( int i = 0; i<array.length; i++)
		{
			System.out.print(array[i]+"\t");
		}
		System.out.println();
		System.out.println("Even numbers are:-");
		for(int j = 0; j<array.length; j++)
		{
			if(array[j]%2 == 0)
			{
				System.out.print(array[j]+"\t");
			}
		}
		
		 

			
	}

}
