package lang_Array;

import java.util.Scanner;

public class Alternate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter many number? \t ");
		int num = sc.nextInt();
		int array[] = new int[num];
		System.out.println("Enter array element:-");
		for (i = 0; i < num; i++) {
			System.out.print("Enter element " + (i + 1) + "=");
			array[i] = sc.nextInt();
		}
		System.out.println("Given array element are:-");
		for (i = 0; i < num; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
		System.out.println("Alternate elements are:-");
		for (i = 0; i < num; i = i + 2) {
			System.out.print(array[i] + "\t");
		}


	}

}
