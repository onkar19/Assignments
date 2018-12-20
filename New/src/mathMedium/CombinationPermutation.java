package mathMedium;
import java.util.Scanner;

public class CombinationPermutation
{
    public static int fact(int num)
    {
    	// initialize and declare objects.
        int fact=1, i;
        for(i=1; i<=num; i++)
        {
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[])
    {
        int n, r;
        Scanner scan = new Scanner(System.in);
		
        // enter numbers here.
        System.out.print("Enter Value of n : ");
        n = scan.nextInt();
        System.out.print("Enter Value of r : ");
        r = scan.nextInt();
		
        // calculate permutation and combination here.
        System.out.print("Combination of the numbers is : " +(fact(n)/(fact(n-r)*fact(r))));
        System.out.print("\nPermutation of the numbers is : " +(fact(n)/(fact(n-r))));
    }
}