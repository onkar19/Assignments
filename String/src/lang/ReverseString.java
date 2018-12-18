package lang;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
char c[]=sc.nextLine().toCharArray();
System.out.println(c.length);
for(int i=c.length-1;i>=0; i--)
{
	System.out.print(c[i]);
}
	}

}
