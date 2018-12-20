package mathMedium;

public class StringPallindrome 
{

	public static void main(String[] args)
	{
		String reverse="";
		String str="onkar";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
			System.out.println(reverse);
			if(reverse==str)
			{
				System.out.println("String is pallindrome");
				
			}
			else
			{
				System.out.println("String is not pallindrome");
			}
		

	}

}
