package lang_Array;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,temp,size;
		int array[] = {5,8,9,4,3,21,89,6};
		size = array.length;
		System.out.println("Given array elements are:");
		for( i = 0; i<size; i++)
		{
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		j = i-1;
		i = 0;
		while(i<j)
		{
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		System.out.println("Reverse array is:");
		for(i = 0; i<size; i++)
		{
			System.out.print(array[i]+" ");
		}

	}

}
