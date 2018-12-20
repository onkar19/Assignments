package mathEasy;
import java.util.*;
public class ArithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1=20;
        int num2=10;
	Scanner sc=new Scanner(System.in);
	System.out.println("PLEASE ENTER YOUR CHOICE:-");
	int ch=sc.nextInt();
	switch(ch)
	{
	case 1:
		System.out.println("ADDITION OF NUMBERS:"+(num1+num2));
		break;
	case 2:
		System.out.println("SUBTRACTION OF NUMBER:"+(num1-num2));
		break;
	case 3:
		System.out.println("DIVISION OF NUMBER:"+(num1/num2));
		break;
	case 4:
		System.out.println("PRODUCT OF NUMBER0:"+(num1*num2));
		break;
	default:
		System.out.println("INVALID CHOICE");
	}
	}}