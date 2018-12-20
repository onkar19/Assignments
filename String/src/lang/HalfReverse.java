package lang;

public class HalfReverse
{
	public static void main(String[] args) 
	{
		   char array[]= {'a','c','c','c','c'};
	    // for(int i = array.length - 1 ; i >= 0;i--)      //reverse of array
	       for(int i = array.length/2 ; i >= 0 ; i--)      //half array reverse
		{
			System.out.println(array[i]);
		}
	      
	}	

}
