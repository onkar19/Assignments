package lang.Vector;

import java.util.List;
import java.util.Vector;

public class SubList_Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec = new Vector<String>();
		vec.add("mango");
		vec.add("orange");
		vec.add("apple");
		vec.add("guava");
		vec.add("grapes");
		vec.add("banana");
		vec.add("papaya");
		vec.add("litchi");
		System.out.println("Given elements are:");
		for(int i = 0; i<vec.size(); i++)
			System.out.println(vec.get(i).toUpperCase());
		System.out.println();
		System.out.println("Sublist of the given elements:-");
		/***
		 * HERE WE ARE PRINTING THE SUB-LIST OF THE GIVEN ELEMENT
		 */
		List subList = vec.subList(2, 5);
		for(int i = 0; i<subList.size(); i++)
			System.out.println(subList.get(i).toString().toUpperCase());
			

	}

}
