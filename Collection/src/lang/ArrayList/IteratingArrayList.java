package lang.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class IteratingArrayList {

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

		System.out.println("Given elements are:" + alist);

		/***
		 * Iterating ArrayList
		 */
		System.out.println("After iterating arrayList:");
		for (String str : alist) {
			System.out.println(str);
		}
		/***
		 * using forr loop	
		 */
		System.out.println("--------------------------------");
		System.out.println("Given list are:");
			for(int i=0; i<alist.size(); i++)
			{
				System.out.println(alist.get(i));
			}
		}
	}


