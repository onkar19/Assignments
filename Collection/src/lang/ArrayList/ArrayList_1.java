package lang.ArrayList;

import java.util.ArrayList;

public class ArrayList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Onkar");
		alist.add("Ravi");
		alist.add("Rajan");
		alist.add("Anant");
		alist.add("Vijay");
		alist.add("Raj");
		alist.add("Pallav");
		alist.add("Mahith");

		System.out.println("Given arrayList are:" + alist);
		/***
		 * Adding new element
		 */
		alist.add(3, "Raghu");
		System.out.println("After adding:" + alist);

		/***
		 * Removing element
		 */
		alist.remove("Raj");
		System.out.println("After removing element:" + alist);

		/***
		 * Removing element from index position.
		 */
		alist.remove(3);
		System.out.println("Removing element from index position:" + alist);

		/***
		 * Updating element
		 */
		alist.set(4, "Ajay");
		System.out.println("After updating the list:" + alist);

		/***
		 * Find the osition of element
		 */
		System.out.println("Position of given element:Ajay");
		int pos = alist.indexOf("Ajay");
		System.out.println(pos);

		/***
		 * Number of element in the list
		 */
		int numElement = alist.size();
		System.out.println("Number of element is:" + numElement);

		/***
		 * Element is present or not
		 */
		System.out.println(alist.contains("Onkar"));

	}

}
