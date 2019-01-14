package lang_Loops;

import java.util.Scanner;

public class Print_Even_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the range:-");
		int num = sc.nextInt();
		System.out.println("Printing even number:-");

		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.print(i + "\t");
			}

		}

	}
}
