package lang;
import java.util.Scanner;

public class WhileLoopDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER");
count=sc.nextInt();
System.out.println("BEFORE LOOP");
while(count<5)
{
System.out.println("COUNT :" +count);
count++;
}
System.out.println("AFTER COUNT");
	}

}
