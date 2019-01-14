package lang_Array;

public class Odd_Array_Print {
	public static void main(String[] args) {

		int array[] = { 2, 5, 6, 7, 9, 12, 25, 26, 98 };

		System.out.println("Given array elements are:-");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
		System.out.println("Odd numbers are:-");
		for (int j = 0; j < array.length; j++) {
			if (array[j] % 2 == 1) {
				System.out.print(array[j] + "\t");
			}
		}

	}
}
