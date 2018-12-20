package lang;

public class HalfString 
{

	public static void main(String[] args) 
	{
		String rev=" ";
		String str= "ONKAR";
		for(int i = str.length()/2 ; i >= 0 ; i--)
		{
			rev=rev+str.charAt(i);
		}
System.out.println(rev);
	}

}
