package lang;
import java.util.Scanner;
public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String reverseString="";
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
String str=sc.next();
//int length=str.length();
for(int i=str.length()-1;i>=0;i--)
{
	reverseString=reverseString+str.charAt(i);

	}
System.out.println(reverseString);
if(str.equals(reverseString))
   System.out.println("String is pallindrome");
else
	System.out.println("String is not pallindrome");
}
}